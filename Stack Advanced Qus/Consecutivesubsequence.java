import java.util.*;

public class Consecutivesubsequence {

    static int[] remove(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } 
            else {
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
                st.pop();
            }
        }
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        int[] res = remove(arr);
        
        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.print("\nAfter removing consecutive subsequences: ");
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}