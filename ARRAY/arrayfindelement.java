import java.util.Scanner;

class findelement {
    void findel() {
        // initialization of the array
        int[] arr = {1, 4, 6, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element to find");
        int n = sc.nextInt();
        int ans = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                ans = i;
                break; // Exit loop once element is found
            }
        }
        
        // Print result after the loop
        if (ans != -1) {
            System.out.println("Found " + n + " at index " + ans);
        } else {
            System.out.println("Element " + n + " not found in the array");
        }
    }
}

public class arrayfindelement {
    public static void main(String[] args) {
        findelement obj1 = new findelement();
        obj1.findel();
    }
}