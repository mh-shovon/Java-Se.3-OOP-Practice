package Java_OOP;

public interface MyInterface {
    void drawShape();
}
class Rectangle implements MyInterface {
    public void drawShape(){
        System.out.println("Drawing Rectangle");
    }
}
class Circle implements MyInterface {
    public void drawShape(){
        System.out.println("Drawing circle");
    }
}
class TestInterface{
    public static void main(String[] args) {
        MyInterface rectangle = new Rectangle();
        rectangle.drawShape();
        MyInterface circle = new Circle();
        circle.drawShape();
    }
}
