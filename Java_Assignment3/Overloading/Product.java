package Overloading;

public class Product {
    private Double price;

    public Double getPrice() {

        return price;
    }

    public void setPrice(Double price) {

        this.price = price;
    }

    public  Double getPrice(int Quantity){

        return price = (Quantity * price);
    }
}
