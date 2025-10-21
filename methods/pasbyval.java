public class pasbyval {

    static void changevalue(int a) {
        a = a * 100;
      
    }

    public static void main(String args[]) {
        int a = 10;
        System.out.println("before changing the value " + a);
        changevalue(a);
        System.out.println("after changing value " + a); // This will still show 10
    }
}