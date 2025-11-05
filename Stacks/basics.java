import java.util.Stack;

public class basics{
    public static void main(String[] args) {
       //
        //int[] arr = new int [n]; 
        //ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(90);//push
        st.push(78);
        System.out.println(st.isEmpty());
        st.push(50);
        st.push(71);
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();//pop
        System.out.println(st);
        System.out.println(st.size());//size
        while(st.size()>1){
            st.pop();//printing first element from the stack
        }
        System.out.println(st);
    }

}