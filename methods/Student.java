public class Student{
    int rollno;
    String studentname;
    public static void main(String[] args) {
        Student obj1=new Student();
        obj1.rollno= 23;
        obj1.studentname = "rohan";
        System.out.println(obj1.rollno);
        System.out.println(obj1.studentname);
    }
}