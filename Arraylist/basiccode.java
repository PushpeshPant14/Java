import java.util.ArrayList;
import java.util.List;

public class basiccode {
    public static void reverse(ArrayList<Integer> list){
        System.out.print(list+" ");
        System.out.println();
        System.out.println("list after reverse");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
    public static void max(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }
            max=Math.max(max, list.get(i));
        }
        System.out.println("Maximum value in list is "+max);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        for(int e:list){                           //dataype - int / Integer / Object koi bhi use kr skte hai
            System.out.print(e+" ");
        }
        System.out.println();
        max(list);
        reverse(list);   
    }
}
