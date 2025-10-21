import java.util.Scanner;
//from iteration//
public class reverse {
 //from iteration
// static String revString(String s){
//     String reverse="";
//     for(int i=s.length()-1 ;i>=0;i--){
//         reverse = reverse+ s.charAt(i);
//     }
// return reverse;
// }
//from recursion
static String reversestring(String s , int idx){
    if(idx==s.length()){
        return "";
    }
    String smallans=reversestring(s,idx+1);
return smallans+s.charAt(idx);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        System.out.println("given string is " + s);
        System.out.println("the reverse of the string is :: ");
     
        System.out.println();
        System.out.println(reversestring(s,0));

        if(s==reversestring(s,0)){
            System.out.println("this is palindrome");
        }
    }    
}
