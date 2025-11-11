import java.util.Stack;

public class insert {




    public static void main(String[] args) {
        //insert at bottom of the stack //
        Stack <Integer> st = new Stack<>();
        st.push(90);
        st.push(7);
        st.push(43);
        st.push(12);
        st.push(0);
        System.out.println(st);
        System.out.println(st);
System.out.println(st);
        int idx=5;
        int x=7;
        //creating a temp satck
        Stack <Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }

        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);


    }
    
}
