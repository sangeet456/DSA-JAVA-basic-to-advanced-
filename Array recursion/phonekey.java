public class phonekey {

    static void combination(String dig,String[]kp,String res){//253
        if(dig.length()==0){
System.out.println(res+" ");

return;}  

int currnum = dig.charAt(0)-'0';
String currchoices=kp[currnum];//"abc"

for(int i=0;i<currchoices.length();i++){
    combination(dig.substring(1), kp, res+currchoices.charAt(i));
}

}

   
    public static void main(String[] args) {
        
        String s= "237" ;
        String[] kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        // 0   1    2   3   4   5   6   7    8    9 
 combination(s, kp, "");
    }
    
}
