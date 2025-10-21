import java.util.Scanner;

class Algebra{
    int add(int a, int b ){
        int ans= a+b;
        return ans ;
    }
    
}
public class methodadd2{
    public static void main(String[] args) {
        Algebra obj=new Algebra();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number : ");
        int x=sc.nextInt();
        System.out.println("enter the second number ");
        int y = sc.nextInt();
    
        int answer=obj.add(x,y);
        System.out.println(answer);
      }



}
