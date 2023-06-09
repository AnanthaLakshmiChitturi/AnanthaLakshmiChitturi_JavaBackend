import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String1");
        String str1 = sc.nextLine();
        System.out.println("Enter a String2");
        String str2 = sc.nextLine();
        String str3 = "";
        if (str1.length() != str2.length()) {
            System.out.println("False");
        }
        str3 = str1 + str1;
        if (str3.contains(str1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}