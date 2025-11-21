import java.util.*;
public class hashsets {

    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("james");
        st.add("james");
        System.out.println(st);
        System.out.println(st.size());
        st.add("charles");
        System.out.println(st.isEmpty());
        System.out.println(st.contains("james"));
        st.add("baby");
        st.add("ice age");
        System.out.println(st);
        st.remove("charles");
        System.out.println(st);
    }
    
}
