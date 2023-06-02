package Overloading;

public class Main {

    public static void main(String[] args)
    {

        Product p = new Product();
        p.setPrice(10.0);
        System.out.println("total cost with Price 10 and quantity 6 is "+p.getPrice(6));

    }
}

