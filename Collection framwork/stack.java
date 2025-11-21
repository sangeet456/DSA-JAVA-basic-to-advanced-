import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        //stack example 
        Stack<Integer> st = new Stack<>();
        st.push(90);
        st.push(23);
        st.push(67);
        st.push(78);
        st.push(889);
        System.out.println(st);
        st.pop();
       int  x= st.pop();
       System.out.println(st.peek());
       st.pop();
        System.out.println(x);
        System.out.println(st.isEmpty());
    


    }
    
}
