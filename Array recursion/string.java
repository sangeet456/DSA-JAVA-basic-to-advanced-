import java.util.Scanner;

public class string {
    static String occurence(String s, char removeChar) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != removeChar) {
                result += s.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        System.out.print("Enter the character to remove: ");
        char removeChar = sc.next().charAt(0);

        System.out.println("Original string: " + s);
        
        String result = occurence(s, removeChar);
        System.out.println("After removing '" + removeChar + "': " + result);
        
        sc.close();
    }
}