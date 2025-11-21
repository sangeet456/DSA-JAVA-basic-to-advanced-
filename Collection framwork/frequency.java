import java.util.*;

public class frequency {
    public static void main(String[] args) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int arr[] = {1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4};
        for (int el : arr) {
            if (!frequency.containsKey(el)) {
                frequency.put(el, 1);
            } else {
                frequency.put(el, frequency.get(el) + 1);
            }
        }
        System.out.println();
System.out.println();
        System.out.println(frequency);
int maxfreq = 0;
int anskey=-1;

for(var e: frequency.entrySet()){
    if(e.getValue()>maxfreq){
        maxfreq = e.getValue();
        anskey = e.getKey();
    }
}
System.out.println(anskey + "\tas the maximum frequency and it occurs \t"+maxfreq +"times");
    }
}