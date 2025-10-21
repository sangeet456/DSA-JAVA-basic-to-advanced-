import java.util.ArrayList;
import java.util.Scanner;

public class returnSSQ {
    static ArrayList<String> getssq(String s) {
        ArrayList<String> ans = new ArrayList<>();
    
        // Base case
        if (s.length() == 0) {
            ans.add(""); // Add empty string for base case
            return ans;
        }
        
        char curr = s.charAt(0);
        
        // Recursive call
        ArrayList<String> smallans = getssq(s.substring(1)); // bc,b,c,""
        
        // Self work
        for (String ss : smallans) {
            ans.add(ss);            // Without current character
            ans.add(curr + ss);     // With current character
        }
        
        return ans; // Don't forget to return the result!
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        
        ArrayList<String> result = getssq(s);
        System.out.println("All subsequences:");
        for (String subsequence : result) {
            System.out.println(subsequence);
        }
        
        sc.close(); // Close the scanner
    }
}