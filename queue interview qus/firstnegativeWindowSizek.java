//first negative in each window of size k // geek for geeks

import java.util.LinkedList;
import java.util.Queue;
class firstnegativeWindowSizek {
    //a ={ 12  -1  -7  8  -15  30  16  28 } N=8   k=3  //

    //output -->   -1  -1  -7  -15  -15   0
     
    public long[] printfirstnegativeInteger(long A[], int n , int k){

        long [] res = new long[n-k+1];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<A.length;i++){
            if(A[i]<0){
                q.add(i);
            }
          
        }
          for(int i=0;i<n-k+1;i++){
             if(q.size()>0 && q.peek()<i) q.remove();
             if(q.peek()<=i+k-1){
                res[i] = A[q.peek()];

             }  
             else if(q.size()==0){res[i]=0;}
             else res[i]=0; 
            }
            return res;


    }

    
}
