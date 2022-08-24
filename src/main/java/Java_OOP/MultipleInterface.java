package Java_OOP;

public class MultipleInterface {
    public static void main(String[] args) {
        Child child = new Child();
        child.looksLike();
        child.behavior();
    }
}
interface Father{
    void looksLike();
}
interface Mother{
    void behavior();
}
class Child implements Father,Mother{
    public void looksLike(){
        System.out.println("Looks like father");
    }
    public void behavior(){
        System.out.println("Behave like mother");
    }
}
