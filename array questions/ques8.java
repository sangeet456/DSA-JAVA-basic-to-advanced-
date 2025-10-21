public class ques8 {

    static void swap( int a ,int b){
        System.out.println("before swapping :: ");
        System.out.println("the value are a and b " +a+ "  " + b);
        System.out.println("after swapping ");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the value are " +a+ " " + b );
    }
    public static void main(String[] args) {
        int x =2;
        int y=4;
        swap(x, y);

    }
    
}
