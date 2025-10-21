public class findsqrt {

    static int sqrt(int x){
int st=0,end=x;
int ans=-1;
while(st<=end){
    int mid=(st+end)/2;
    int value = mid*mid;
    if(value==x){return mid;}
    if(value<x){
        ans=mid;
        st=mid+1;
    }
    else{
        end = mid-1;
    }
}

return ans;    }
    public static void main(String[] args) {
        int x=24;
        System.out.println(sqrt(x));
    }
    
}
