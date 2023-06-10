import java.util.Arrays;
import java.util.Collections;
public class inbuiltsort {
    public static void main(String[] args) {
        Integer arr[] ={4,6,23,5,75,1,0};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("collections");
        Arrays.sort(arr,2,5,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
