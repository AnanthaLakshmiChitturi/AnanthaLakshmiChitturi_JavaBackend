import java.util.Arrays;

public class AverageOfOddNumbers {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0) // Filter odd numbers
                .map(n -> n * n) // Square each number
                .reduce(0, Integer::sum); // Sum all squared numbers

        long count = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0) // Filter odd numbers
                .count(); // Count the number of odd numbers

        double average = count > 0 ? (double) sum / count : 0;

        System.out.println("Average of squares of odd numbers: " + average);
    }
}