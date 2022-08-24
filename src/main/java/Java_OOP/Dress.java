package Java_OOP;

public class Dress {
    public int price;
    private String brand;
    private String size;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Dress shirt1 = new Dress();
        shirt1.setBrand("Rich-Man");
        shirt1.setSize("15");
        shirt1.setColor("Blue");

        Dress shirt2 = new Dress();
        shirt2.setBrand("Gentle Park");
        shirt2.setSize("16");
        shirt2.setColor("Black");

        Dress shirt3 = new Dress();
        shirt3.setBrand("Easy");
        shirt3.setSize("18");
        shirt3.setColor("Maroon");

        System.out.println("Shirt1 Details is : \n" + "Brand is : " + shirt1.getBrand() + "\n" + "Size is : " + shirt1.getSize()+ "\n" + "Color is : " + shirt1.getColor() + "\n");
        System.out.println("Shirt2 Details is : \n" + "Brand is : " + shirt2.getBrand() + "\n" + "Size is : " + shirt2.getSize()+ "\n" + "Color is : " + shirt2.getColor() + "\n");
        System.out.println("Shirt3 Details is : \n" + "Brand is : " + shirt3.getBrand() + "\n" + "Size is : " + shirt3.getSize()+ "\n" + "Color is : " + shirt3.getColor() + "\n");
    }
}

class MyDress{
    public static void main(String[] args) {

        Dress shirt = new Dress();
        shirt.price = 500;
        shirt.price = 600;
        System.out.println("Shirt price is : " + shirt.price);
    }
}
