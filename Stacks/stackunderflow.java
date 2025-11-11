import java.util.Stack;

public class stackunderflow {
    public static void main(String[] args) {
        // under flow //
        Stack<Integer> st = new Stack<>();
        st.push(56);
        st.push(45);
        st.push(78);
        st.push(12);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);// this will give exception of stack overflow //

    }
}
