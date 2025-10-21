public class palisubstring {
    public static boolean ispalindrome(String str){

        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    static void substring(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.print(str.substring(i, j)+" ");
            }
        }
       
    }
    public static void main(String[] args) {
        int count =0;
        String str = "abc";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(ispalindrome(str.substring(i,j))==true){

                    count ++;
                }
            }
        }
System.out.println("no of palindromic substring are :: " + count);
    }
    
}
