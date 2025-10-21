class arrayex{
    void sumexample(){
        int[] arr= {1,5,3};
        int sum=0;

        for(int i=0;i<arr.length;i++)
    {    sum= sum+ arr[i];
    }     
        System.out.println("sum is " +sum);
    }
}
public class arraysum{
    public static void main(String[] args) {
        arrayex obj= new arrayex();
        obj.sumexample();
    }

}