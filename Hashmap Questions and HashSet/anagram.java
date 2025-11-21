import java.util.HashMap;

public class anagram {

    static HashMap<Character,Integer> makefreq(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                int currfreq=mp.get(ch);
                mp.put(ch,currfreq+1);
            }

        }return mp;
    }
static boolean validanagram(String st1 , String st2){
    if(st1.length() !=st2.length()){
        return false;
    }
    HashMap<Character,Integer> mp1 =makefreq(st1);
    HashMap<Character,Integer> mp2 =makefreq(st2);
    
return mp1.equals(mp2);
}
    public static void main(String[] args) {
        String st1 = "keen";
        String st2 = "knee";
        System.out.println(validanagram(st1, st2)
        );
    }
    
}
