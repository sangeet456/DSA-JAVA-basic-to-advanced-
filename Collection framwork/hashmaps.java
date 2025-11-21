import java.util.*;

public class hashmaps {
    public static void main(String[] args) {
        // mapinterface is hashmaps //
        Map<String, Integer> hm = new HashMap<>();
        // adding elements
        hm.put("akash", 67);
        hm.put("pratikshya", 78);
        hm.put("loyal", 78);
        hm.put("rishika", 67);
        // getting value from the hasjhmap
        System.out.println(hm.get("akash"));
        hm.get("pratikshya");
        System.out.println(hm);
        hm.put("akash", 700);
        System.out.println(hm.get("akash"));
        // put used for the insertion or updation//
        hm.remove("akash");
        System.out.println(hm.remove("rishika"));
        System.out.println(hm.containsKey("akash"));
        hm.putIfAbsent("risshi", 89);
        System.out.println(hm);
        System.out.println(hm.keySet());
        // value return the values of the given keys //
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
        // traversing the hashmaps
        for (String key : hm.keySet()) {
            System.out.println("Age of" + key + "is" + hm.get(key));
        }

        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println("age of" + e.getKey() + " is " + e.getValue());
        }
    }

}
