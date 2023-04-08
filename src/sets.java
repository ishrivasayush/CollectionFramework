import java.util.*;

public class sets {
    public static void main(String[] args) {
        //Unordered
        Set<Integer> st=new HashSet<>();
        //Ordered
        Set<Integer> lst=new LinkedHashSet<>();
        //ordered sorted and No duplicates.
        SortedSet<Integer> List=new TreeSet<>();
        st.add(1000);
        st.add(2000);
        st.add(3000);
        st.add(4000);
        st.remove(3000);
        System.out.println(st.contains(4000));
        System.out.println(st);
    }
}
