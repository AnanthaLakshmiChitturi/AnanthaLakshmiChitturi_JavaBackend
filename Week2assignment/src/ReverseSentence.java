import java.util.Scanner;

public class ReverseSentence {
    public static void main(String args[]) {
        System.out.println("Enter the sentence");
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        String[] w1 = sen.split(" ");
        String revSen = "";
        for (int i = 0; i < w1.length; i++) {
            String w = w1[i];
            String revw = "";
            for (int j = w.length() - 1; j >= 0; j--) {
                revw = revw + w.charAt(j);
            }
            revSen = revSen + revw + " ";
        }
        System.out.println(revSen);

    }
}