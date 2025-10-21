import java.util.Scanner;
//from iteration//
public class palindrome {
 //from iteration
// static String revString(String s){
//     String reverse="";
//     for(int i=s.length()-1 ;i>=0;i--){
//         reverse = reverse+ s.charAt(i);
//     }
// return reverse;
// }
//from recursion
static String reverse(String s , int idx){
    if(idx==s.length()){
        return "";
    }
    String smallans=reverse(s,idx+1);
return smallans+s.charAt(idx);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        System.out.println("given string is " + s);
        System.out.println("the reverse of the string is :: ");
     
        System.out.println();
        System.out.println(reverse(s,0));
        String rev = reverse(s, 0);
        if(rev.equals(s)){
            System.out.println("this is palindrome");

        }
        else{
            System.out.println("this is not a paliondrome");
        }
        sc.close();

      
    
    }    
}
