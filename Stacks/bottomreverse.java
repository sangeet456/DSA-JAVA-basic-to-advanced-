import java.util.*;
public class bottomreverse {

//recursion reverse stack using push at bootom function//
 static void reverse(Stack<Integer> st){
    if(st.size()==1)return;
    int top = st.pop();
    reverse(st);
    pushatbottom(st, top);
 }
    


public static void pushatbottom(Stack<Integer> st , int x){
    if(st.size()==0){//for empty stack
        st.push(x);
    }
    Stack<Integer> temp = new Stack<>();
    while(st.size()>0){
        temp.push(st.pop());
    }
    st.push(x);
    while(temp.size()>0){
        st.push(temp.pop());
    }

    
    }


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(78);
        st.push(7);
        st.push(68);
        st.push(8);
        st.push(58);
        System.out.println(st);
        reverse(st);
        System.out.println("stack in reverse order \n");
        System.out.println(st);
    }
    
}
