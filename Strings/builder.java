
import java.util.*;

public class builder {
 public static void main(String[] args) {
    StringBuilder str = new StringBuilder("hello");
    str.append("world");
    System.out.println(str);
    // hello->> mello

  str.setCharAt(0, 'm');
  System.out.println(str);
  str.append(67);

  System.out.println(str);
  str.insert(1,'k');

  System.out.println(str);
  str.deleteCharAt(9);

  System.out.println(str);
  str.reverse();

  System.out.println(str);
  str.reverse();
  
  str.delete(0,5);
  System.out.println(str);
 }
    
}
