import java.util.Scanner;

class ExceptionStringToInt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
       try{
            int number = Integer.parseInt(str);
            System.out.println(number);
        }
       catch (Exception ex){
            System.out.println("Exception Occured"+ex);
        }
    }

}








