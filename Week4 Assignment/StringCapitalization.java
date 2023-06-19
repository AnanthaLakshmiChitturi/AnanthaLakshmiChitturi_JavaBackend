import java.util.Arrays;

public class StringCapitalization {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date"};

        Arrays.stream(strings)
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                .sorted((str1, str2) -> {
                    for (int i = 0; i < str1.length() && i < str2.length(); i++) {
                        char c1 = str1.charAt(i);
                        char c2 = str2.charAt(i);
                        if (c1 != c2)
                            return c1 - c2;
                    }
                    return str1.length() - str2.length();
                })
                .forEach(System.out::println);
    }
}
