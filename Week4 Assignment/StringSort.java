import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "pear", "kiwi", "orange"};

        Arrays.sort(strings, (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return Integer.compare(s1.length(), s2.length());
            } else {
                return Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1));
            }
        });

        System.out.println("Sorted array: " + Arrays.toString(strings));
    }
}

