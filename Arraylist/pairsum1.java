import java.util.ArrayList;
                           //sorted arraylist pairsum , target find

//all pair approach
public class pairsum1 {
    //brute force approach
    public static boolean findBF(ArrayList<Integer> num,int target){
        for(int i=0;i<num.size();i++){
            for(int j=i+1;j<num.size();j++){
                if(num.get(i)+num.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }

    //two pointer approach
    public static boolean findOP(ArrayList<Integer> num,int target){
        //optimised approach
        int lp=0;
        int rp =num.size()-1;
        while(lp<rp){
            if(num.get(lp)+num.get(rp)==target){
                return true;
            }
            if(num.get(lp)+num.get(rp)<target){
                lp++;
            }
            if(num.get(lp)+num.get(rp)>target){
                rp--;
            }  
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        int target= 10;
        System.out.println(findBF(num, target));
        System.out.println(findOP(num, target));
    }
}
