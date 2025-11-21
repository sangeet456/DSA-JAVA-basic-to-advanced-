import java.util.*;

public class myarraylist{

    static void arraylist(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(89);
        l.add(78);
        l.add(46);
        System.out.println(l);
        l.get(1);
        System.out.println(l.get(2));
        l.set(2,9997);
        System.out.println(l);
    }
    public static void main(String[] args) {

        arraylist();
 
      
    }
    
}
