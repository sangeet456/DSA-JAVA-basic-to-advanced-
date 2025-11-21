import java.util.HashSet;

public class hashset {

    public static void main(String[] args) {
        
        HashSet<Integer> st = new HashSet<>();
        st.add(78)
        ;st.add(2);
        st.add(6);
        st.add(67);
        st.add(54);
        st.add(41);
        st.add(65);
        System.out.println(st)
        ;
        st.remove(78);
        System.out.println(st.contains(6));
        System.out.println(st.size());
        System.out.println(st);
    }
    
}
