import java.util.Stack;

public class arraystackimplement {
    public static class Stack{
        private int[] arr = new int[5];
        private int idx =0;
        void push(int x){
            if(isfull()){
                System.out.println("stack is full");
                return;
            }
            arr[idx] = x;
            idx++;

        }
        int peek(){
            if(idx==0){
                return -1;
            }
            else{
            return arr[idx-1];
        }
        }
        int pop(){
            if(idx==0){return -1;}
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+ " ");
            }
        }
        int size(){
            return idx;
        }

        boolean isempty(){
            if (idx ==0) return true;
            else return false;
        }

        boolean isfull(){
            if( idx == arr.length) return true;
            else return false;
        }


    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(3);
        st.push(5);
        st.push(67);
        st.display();
        System.out.println(); // 3 5 67 
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println();
        st.push(67);
        st.push(34);
        st.push(23);
        st.display();
     System.out.println(st.isempty() +" "+ st.isfull()); 
     System.out.println();
     System.out.println(st.peek());;
    }
    
}
