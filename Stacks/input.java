import java.util.Scanner;
import java.util.Stack;

public class input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("enter the no of element in stack");
        n= sc.nextInt();
        System.out.println("enter the elements ");
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println();
        System.out.println(st);
        System.out.println();
        System.out.println("stack in rev order");

        //reverse order //
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            int x= st.peek();
            gt.push(x);
            st.pop();
        }
        System.out.println(gt);

        //stack in same order print
        Stack<Integer> sf = new Stack<>();
        while(gt.size()>0){
            int y = gt.peek();
            sf.push(y);
            gt.pop();            
        }
        System.out.println("stack in same order");
           System.out.println(sf);
           sc.close();
    }
    
}
