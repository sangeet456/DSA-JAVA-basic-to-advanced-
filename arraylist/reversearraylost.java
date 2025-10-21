import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class reversearraylost {

    static void reverselist(ArrayList<Integer> l1){
      int i=0, j=l1.size()-1;
      while(i<j){
        Integer temp=Integer.valueOf(l1.get(i));
        l1.set(i,l1.get(j));
        l1.set(j,temp);
      
      i++;
    j--;
  }


    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
    ArrayList<Integer> l1 = new ArrayList<>();
    System.out.println("enter the size for the array list");
    int n= sc.nextInt();
     System.out.println("enter arraylist elements");
     for(int i=0;i<n;i++){
       l1.add(sc.nextInt());
     }
System.out.println("original liost");
     System.out.println(l1);

     Collections.reverse(l1);
     System.out.println(l1);
     Collections.sort(l1);
System.out.println(l1);

    }

    
}
