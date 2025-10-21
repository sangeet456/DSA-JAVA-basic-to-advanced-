import java.util.Scanner;

public class uppertolowecase {
    //input -- physICS
    //output --pHYSics
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        //toggle for inout string
        // sce
for(int i=0;i<=str.length()-1;i++){
    //P -->> p
    //check letter is capital or small 
    boolean flag =true; // true for capttal; 
    char ch =str.charAt(i);
    int asci =(int)ch;
    if(asci>=97){
        flag =false;//small lettter 
    }
    if(flag == true){
        asci+=32;
     char dh = (char)asci;
        str.setCharAt(i, dh);

    }    
    else{
        //small
         asci-=32;
        char dh =(char)asci;
        str.setCharAt(i,dh);
    }
}
System.out.println(str);
   sc.close();
 }
    
}
