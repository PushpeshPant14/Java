import java.util.*;
public class abhi {
    // public static int workleft(int work,int f1,int d1,int f2,int d2){
    //     int a=0;
    //     a = work-((f1*d1)+(f2*d2));
    //     return a;
    // }
    // public static void main(String[] args) {
    //     int result = workleft(155, 15, 6, 10, 4);
    //     System.out.println(result);
    // }

    public static void main(String[] args) {
        String myStr = "abhi lucky abhi";
        String[] splited = myStr.split(" ");   //important
        Arrays.sort(splited);
        System.out.println(Arrays.toString(splited));
        int max = 0;
        int count= 1;
        String word = splited[0];
        String curr = splited[0];
        for(int i = 1; i<splited.length; i++){
            if(splited[i].equals(curr)){
                count++;
            }
            else{
                count =1;
                curr = splited[i];
            }
            if(max<count){
                max = count;
                word = splited[i];
            }
        }
        System.out.println(max + " x " + word);
    } 
}
