import java.util.*;
public class palindromic{
    public static void main(String[] args) {
        String str = "abba";
int i=0;
int j =str.length()-1;
boolean flag =true ;//---> palindrome hai \\

while(i<j){
    if(str.charAt(i)!=str.charAt(j)){
        flag =false;
        break;
    }
    i++
    ;
    j--
    ;    
}if(flag==true)System.out.println("palindrome");
else System.out.println("not a palindrome : ");
// return -1;

    //     String str="aca";
    //     StringBuilder gtr = new StringBuilder(str);
    //     gtr.reverse();
    //    String stg = gtr + "";
    //     if(str.equals(stg)){
    //     System.out.println("yes");    
    //     }
    //     else{
    //         System.out.println("no");
    //     }

    }
}