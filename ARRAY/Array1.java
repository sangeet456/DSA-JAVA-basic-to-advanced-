class arrayexample{
    void demoarrays(){
        int [] ages = new int [5];
        String [] name = new String[5];
        // ages[0]=1;
        // ages[1]=3;
        // ages[2]=4;
        name[1]="ramesh";
        name[2]= "ram";
        name[0]="hanuman";
        // System.out.println(ages[0]);
        // System.out.println(name[2]);
        // System.out.println(name[0]);


    //traversing with the help of the for loops
        
    for(int i=0;i<=2;i++){
        System.out.println(name[i]);
    }
    }
 
 

    public static void main(String[] args) {
       arrayexample obj= new arrayexample();
       obj.demoarrays();
        
    }}
