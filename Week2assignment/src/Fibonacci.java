import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        int firstTerm = 0, secondTerm = 1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(firstTerm + ", ");
            int nextTerm=firstTerm+secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }

    }
}
