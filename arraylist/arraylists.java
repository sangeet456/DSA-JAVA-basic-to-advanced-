import java.util.ArrayList;

public class arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Boolean> l2= new ArrayList<>(); 
    l1.add(7);
    l1.add(8);
    l1.add(9);
    l1.add(78);
    System.out.println(l1.get(1));
    System.out.println("whole array");
    for(int i=0;i<l1.size();i++){
        System.out.print(l1.get(i) + " ");
    }
    //print arraylist directly
    System.out.println(l1);
    l1.add(1,89);
    System.out.println(l1);
    //remove element
    l1.remove(Integer.valueOf(89));
    System.out.println(l1);
    //check if the element exixst or not in the array
    boolean ans = l1.contains(Integer.valueOf(7));
    System.out.println(ans);
    ArrayList l = new ArrayList();

l.add(89);
l.add(80);
l.add("ram");
l.add(true);
System.out.println(l);
    }
    
}
