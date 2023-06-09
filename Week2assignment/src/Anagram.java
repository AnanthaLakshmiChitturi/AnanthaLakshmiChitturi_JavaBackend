import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String args[]){
        System.out.println("Enter the String 1");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println("Enter the String 2");
        String str2=sc.nextLine();
        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram");
        }
        else{
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean arr= Arrays.equals(arr1,arr2);
            if(arr){
                System.out.print("They are anagrams");
            }
            else{
                System.out.println("They are not anagrams");
            }
        }

    }
}
