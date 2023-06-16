import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ArraySumMultiThreaded {
    private static final int ARRAY_SIZE = 100;
    private static final int THREAD_COUNT = 5;

    private static int[] array = new int[ARRAY_SIZE];
    private static int[] partialSums = new int[THREAD_COUNT];
    private static int finalSum = 0;

    public static void main(String[] args) {
        // Initialize the array with values from 1 to 100
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }

        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

        // Divide the array into equal parts and assign each part to a thread
        int chunkSize = ARRAY_SIZE / THREAD_COUNT;
        for (int i = 0; i < THREAD_COUNT; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == THREAD_COUNT - 1) ? ARRAY_SIZE : (startIndex + chunkSize);

            executorService.submit(new PartialSumCalculator(i, startIndex, endIndex));
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Combine the partial sums to get the final sum
        for (int partialSum : partialSums) {
            finalSum += partialSum;
        }

        System.out.println("Final sum: " + finalSum);
    }

    static class PartialSumCalculator implements Runnable {
        private int threadIndex;
        private int startIndex;
        private int endIndex;

        PartialSumCalculator(int threadIndex, int startIndex, int endIndex) {
            this.threadIndex = threadIndex;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public void run() {
            int partialSum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                partialSum += array[i];
            }
            partialSums[threadIndex] = partialSum;
        }
    }
}
