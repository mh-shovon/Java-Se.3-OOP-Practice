package Java_OOP;

public class MySalary {
    public int getSalary(int hour){
        return hour*500;
    }
    public int getSalary(int hour, int overtime){
        return (hour*500)+(overtime*700);
    }

    public static void main(String[] args) {
        MySalary mySalary = new MySalary();
        int salary = mySalary.getSalary(8,2);
        System.out.println(salary);
    }
}
