import java.util.HashMap;

public class isomorphicStrings {
    static boolean isisomorphic(String s ,String t){
        HashMap<Character,Character> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character sch=s.charAt(i);
            Character tch=t.charAt(i);
            if(mp.containsKey(sch)){
                if (mp.get(sch)!=tch) {
                    return false;
                }
                else if(mp.containsValue(tch)){
                    return false;
                }
                else{mp.put(sch,tch);}
            }
        }
    return true ;}
    public static void main(String[] args) {
        String s="abcdac";
        String t="xyzwxp";
        System.out.println(isisomorphic(s,t));
    }
}
