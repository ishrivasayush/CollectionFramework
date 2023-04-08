import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        List<Integer> l2=new LinkedList<>();
        List<Integer> l3=new Vector<>();
        Vector<Integer> l4=new Stack<>();


        l.add(1000);
        l.add(2000);
        l.add(3000);
        l.add(4000);
        l.add(5000);
        l.add(6000);

        System.out.println(l);
        l.clear();
        System.out.println(l);
        l.add(0,12);

        System.out.println(l.get(0));




    }
}
