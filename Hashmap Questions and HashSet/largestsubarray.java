import java.util.HashMap;

public class largestsubarray {

    
        static int zerosumlargestsubarray(int[]arr,int n){
            HashMap<Integer,Integer> mp = new HashMap<>();
            int maxlen=0;
            int prefixsum=0;
            mp.put(0,-1);
            for(int i=0;i<arr.length;i++){
                prefixsum = prefixsum+arr[i];
                if(mp.containsKey(prefixsum)){
                    maxlen = Math.max(maxlen,i-mp.get(prefixsum));
                }
                else{
                    mp.put(prefixsum,i);
                }
            }

        return maxlen;}
    
    public static void main(String[] args) {
        int[] a ={15,-2,2,-8,1,7,10};
        int x= a.length;
        
       System.out.println(zerosumlargestsubarray(a, x));
        
    }
    
}
