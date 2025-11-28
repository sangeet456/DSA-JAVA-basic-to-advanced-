import java.util.ArrayList;
import java.util.List;
//using rescursion
public class PrintPermutationUsingRecursion{

static void printp(String str , String t ,List<String>l){
    if(str.equals("")){ 
        l.add(t);
        System.out.println(t);return;}
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        String left = str.substring(0, i);
        String right= str.substring(i+1);
        String remaining = left+right;
        printp(remaining,t+ch,l);

    }
}


    public static void main(String[] args) {
        String str = "abc";
        System.out.println();
        List<String> l = new ArrayList<>();
        printp(str, "",l);
        for(int i=0;i<l.size();i++){
            System.out.println(l);
        }
        
    }
}