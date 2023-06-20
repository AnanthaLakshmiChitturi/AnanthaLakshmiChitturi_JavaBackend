import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArrayExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("OpenAI");

        // Convert ArrayList to Array
        String[] array = arrayList.toArray(new String[0]);

        // Print the elements of the array
        System.out.println("Array elements:");
        System.out.println(Arrays.toString(array));
    }
}
