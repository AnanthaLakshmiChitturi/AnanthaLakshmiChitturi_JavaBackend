import java.util.ArrayList;

public class RemoveLastObject {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Durian");

        System.out.println("ArrayList before removal: " + arrayList);

        // Remove the last object
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
            System.out.println("Last object removed.");
        } else {
            System.out.println("ArrayList is already empty.");
        }

        System.out.println("ArrayList after removal: " + arrayList);
    }
}
