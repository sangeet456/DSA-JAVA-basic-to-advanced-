

public class Arrayimplementqueue {
    public static class queueA{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr = new int[100];
         void add(int val){
            if(r==arr.length-1){
                System.out.println("queue is full :: ");
                return;
            }
            if(f==-1){ //queue is empty
                f=r=0;
                arr[0]=val;
            }
            else{
                arr[r+1]=val;
                r++;
            }
            size++;
        }
        public int remove(){
            if(size==0) {System.out.println("queue is empty"); return -1;}
           
            f++;
            size--;
            return arr[f-1]; 
            
        }
        public int peek(){
            if(size==0) {System.out.println("queue is empty"); return -1;}
            return arr[f];
        }
        public void display(){
            if(size==0){System.out.println("queue is empty !!");}
            else
        for(int i=f;i<=r;i++){
            System.out.print(arr[i]+ " ");
        }
        }

    }
    public static void main(String[] args) {
        queueA q= new queueA();
        q.display();
        q.add(90);
        q.add(89);
        q.add(67);
        q.add(78);
        q.display();
        q.remove();
        q.display();
        
    }
}
