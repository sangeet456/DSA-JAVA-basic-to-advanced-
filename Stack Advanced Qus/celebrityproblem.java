import java.util.Stack;

class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        Stack<Integer> st = new Stack<>();
        
        // Push all people to stack
        for(int i = 0; i < n; i++) {
            st.push(i);
        }    
        
        // Eliminate non-celebrities
        while(st.size() > 1) {
            int val1 = st.pop();
            int val2 = st.pop();
            
            // If val1 knows val2, val1 cannot be celebrity
            if(mat[val1][val2] == 1) {
                st.push(val2);
            } 
            // If val2 knows val1, val2 cannot be celebrity
            else {
                st.push(val1);
            }
        }
        
        if(st.size() == 0) return -1;
        
        int potential = st.pop();
        
        // Verify if potential is actually a celebrity
        for(int j = 0; j < n; j++) {
            // Celebrity should not know anyone
            if(potential != j && mat[potential][j] == 1) {
                return -1;
            }
        }
        
        for(int i = 0; i < n; i++) {
            // Everyone should know the celebrity
            if(potential != i && mat[i][potential] == 0) {
                return -1;
            }
        }
        return potential;
    }
}