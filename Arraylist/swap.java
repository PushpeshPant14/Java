import java.util.ArrayList;

public class swap {
    public static void swapping(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(100);
        System.out.print(list+" ");
        System.out.println();
        swapping(list,2,4);
        System.out.print(list+" ");
    }
}
