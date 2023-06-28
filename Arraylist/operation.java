import java.util.ArrayList;

public class operation {
    public static void main(String[] args) {
        //operations
        ArrayList<Integer> list= new ArrayList<>();
        //add
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.print(list+" ");
        System.out.println();
        //get
        System.out.println(list.get(3));
        //remove
        list.remove(3);
        System.out.print(list+" ");
        System.out.println();
        //set
        list.set(0,100);
        System.out.print(list+" ");
        System.out.println();
        //contains
        System.out.println(list.contains(100));
        System.out.println(list.contains(1000));
        //size
        System.out.println("size of list is "+list.size());
    }
}
