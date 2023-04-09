import java.util.ArrayList;
import java.util.Arrays;

public class arrylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        arr.get(3);

        //2D ArrayList
        ArrayList<ArrayList<Integer>> arr1=new ArrayList<>();
        arr1.add(new ArrayList<>(Arrays.asList(100,200,300,400)));
        arr1.add(new ArrayList<>(Arrays.asList(100,200,300,400)));
        arr1.add(new ArrayList<>(Arrays.asList(100,200,300,400)));
        arr1.add(new ArrayList<>(Arrays.asList(100,200,300,400)));
        arr1.add(new ArrayList<>(Arrays.asList(100,200,300,400)));

        for (int i = 0; i <arr1.size() ; i++) {
            for (int j = 0; j <arr1.get(i).size() ; j++) {
                System.out.print(arr1.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
