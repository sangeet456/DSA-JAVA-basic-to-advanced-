class Arrayexample{

    void multiarrays(){

       
        int [][] arr = {{56,78,23},{89,76,45},{12,13,65}};
//arr[0] itself is a array arr[0][2]
        // System.out.println(arr[0][0]);//56
        // System.out.println(arr[0][1]);//78
        // System.out.println(arr[0][2] + "\n");//23

        //  System.out.println(arr[1][0]);
        // System.out.println(arr[1][1]);
        // System.out.println(arr[1][2]);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
public class Array2{
    public static void main(String[] args) {
        Arrayexample obj = new Arrayexample();
        obj.multiarrays();
    }
}