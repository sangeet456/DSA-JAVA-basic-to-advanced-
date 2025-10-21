
//string basics //

import java.util.*;
public class stringbasics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //string 
        String str="college wallaa";
        String gtr = "college wallaz";
        System.out.println(str);
        System.out.println(str.length());
        //character at
        System.out.println(str.charAt(3));
        //index
        System.out.println(str.indexOf('a'));
        //chota bada lexographically 
        System.out.println(str.compareTo(gtr));
        String s1="abcd";
        String s2= "def";

        System.out.println(s1.concat(s2));
        sc.close();
    }   
}