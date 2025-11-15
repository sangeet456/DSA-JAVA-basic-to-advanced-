public class circularqueue {

    public static class Cqa{
       int front = 0;
       int rear = 0;
       int size = 0;
       int [] arr = new int[100];
       public void add(int val) throws Exception{
        if(size==arr.length){
          throw new Exception("queue is full");
        }
        else if (size==0){
            front = rear = 0;
            arr[0]=val;
        }
        else if(rear<arr.length-1){
            arr[++rear] = val;
        }
        else if(rear == arr.length-1){
            rear=0;
            arr[0]=val;
        }
        size++;
       }
     
     int remove() throws Exception{
        if(size==0) {throw new Exception("queue is empty");}
        else {
            int val = arr[front];
            if(front == arr.length-1){
                front = 0;
            }
            else front++;
            size--;
            return val;
            
        }    
       
    }

    int peek() throws Exception{
        if(size ==0){
            throw new Exception("queue is empty");
        }
        else return arr[front];
    }

    public void display(){
        if(size==0){
            System.out.println("queue is empty");
        }
        else{
            if(front<=rear){
                for(int i = front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for(int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
    }
    public static void main(String[] args) throws Exception{
        Cqa q = new Cqa();
        q.add(78);
        q.add(98);
        q.add(45);
        q.add(4);
        q.add(3);
    q.display();
    q.remove();
    System.out.println();
    q.display();
    System.out.println();
     System.out.println(q.peek());
    }
}