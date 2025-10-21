import java.util.*;
//reversing  the each word in the sentence
//im educatir ka reverse har ek wiord 
public class goodrevere{
    public static void main(String[] args) {
        String str = "i am the edua";
        String ans ="";
    StringBuilder sb = new StringBuilder("");
   for(int i=0;i<str.length();i++){
    char ch = str.charAt(i);
    if(ch!=' '){
        sb.append(ch);
    }
    else{
        sb.reverse();
        ans+=sb;
        ans+=" ";
        sb = new StringBuilder(" ");
    }

   }
   sb.append(" ");
   sb.reverse();
   ans+=sb;
System.out.println(ans);    
}
    
}
