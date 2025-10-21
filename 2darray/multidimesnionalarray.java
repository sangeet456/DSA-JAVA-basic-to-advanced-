public class multidimesnionalarray{
  static void printarray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int[][] arr= new int[2][3];
        // arr[0][0]=34;
        // arr[0][1]=45;
        // arr[0][3]=89;
        // arr[1][1]=89;
        // arr[1][2]=89;
        // arr[1][3]=89;
        int[][]arr2 ={{1,5,6},{6,7,8},{9,8,7}};
        
    printarray(arr2);
    
 }
    
}