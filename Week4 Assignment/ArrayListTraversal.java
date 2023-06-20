import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTraversal {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Durian");
        arrayList.add("Elderberry");

        // Using for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < arrayList.size(); i++) {
            String element = arrayList.get(i);
            System.out.println(element);
        }
        System.out.println();

        // Using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (String element : arrayList) {
            System.out.println(element);
        }
        System.out.println();

        // Using iterator
        System.out.println("Using iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        System.out.println();

        // Using forEach
        System.out.println("Using forEach:");
        arrayList.forEach(element -> System.out.println(element));
        System.out.println();

        // Using parallel Stream
        System.out.println("Using parallel Stream:");
        arrayList.parallelStream().forEach(element -> System.out.println(element));
    }
}

