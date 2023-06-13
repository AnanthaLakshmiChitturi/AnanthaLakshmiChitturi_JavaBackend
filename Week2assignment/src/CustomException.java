import java.util.*;
class InvalidAgeException  extends Exception
{
    public InvalidAgeException (String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}

// class that uses custom exception InvalidAgeException
public class CustomException
{
    static void validate (int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("age is not valid to vote");
        }
        else {
            System.out.println("welcome to vote");
        }
    }
    public static void main(String args[])
    {
        try
        {
            System.out.println("Enter Integer");
            Scanner sc=new Scanner(System.in);
           int age= sc.nextInt();
            validate(age);
        }
        catch (InvalidAgeException ex)
        {
            System.out.println("Caught the exception");
            System.out.println("Exception occured: " + ex);
        }
        System.out.println("rest of the code...");
    }
}