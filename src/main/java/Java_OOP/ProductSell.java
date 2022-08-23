package Java_OOP;

public class ProductSell { //class
    public int vat; //load property
    public ProductSell(int vat){ //parameteraised constructor
        this.vat=vat;
    }
    public int getPrice(int price){ //method calling
        price+=(price*vat/100);
        return price;
    }
    public static void main(String[] args) {
        ProductSell shirt = new ProductSell(15);
        int totalShirtPrice = shirt.getPrice(100);
        System.out.println(totalShirtPrice);

        ProductSell pant = new ProductSell(2);
        int totalPantPrice = pant.getPrice(2000);
        System.out.println(totalPantPrice);
    }
}
