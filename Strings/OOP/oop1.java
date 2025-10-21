package OOP;
import java.util.*;

public class oop1 {
    public static class student {
        //create new data type//
        String name;
        int rollno;
        double percentage;
    }
public static class  car{
String name; 
String type;
int price;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car c1= new car();
      student x = new student();
      x.name ="sangeet";
      x.rollno = 45;
      x.percentage= 68.9;
      System.out.println(x.name);    
    System.out.println(c1.name="sedan");
    }
}
