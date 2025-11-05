import java.util.Stack;

public class recursionprint {
    // Prints in reverse order 
    static void displayrec(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        System.out.println(top);
        displayrec(st);
        st.push(top);
    }
//original print stack
    static void display(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        display(st);  
        System.out.println(top);
        st.push(top);
    }
    
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(90);
        st.push(989);
        st.push(23);
        st.push(12);
        st.push(23);
        
        System.out.println("Original stack: " + st);
        
        System.out.println("\nUsing displayrec (reverse order):");
        displayrec(st);
        
        System.out.println("\nUsing display (original order):");
        display(st);
        
        System.out.println("\nStack after all operations: " + st);
    }
}