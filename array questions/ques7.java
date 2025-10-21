//swapping the variables of a and b

public class ques7{
static void swap(int a , int b){
    System.out.println("original values of a and b is "+ a +"and "+ b);
    System.out.println("after swapping");
    int temp =a ;
    a=b;
    b=temp;
    System.out.println("after swapping values are " +a+"  and   " + b +"respectively");
}
    public static void main(String[] args) {
        int x=9;
        int y=3;
        int[] arr = {1,2,3,4,5,6,7};
        swap(x, y);
    }

}
