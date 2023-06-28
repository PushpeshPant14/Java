import java.util.ArrayList;
public class pairsum2 {

    public static boolean find(ArrayList<Integer> num,int target){
        int bp=-1;
        for(int i=0;i<num.size();i++){
            if(num.get(i)>num.get(i+1)){
                bp=i;
                System.out.println(bp);
                break;
            }
        }
        int lp= bp+1; //smallest
        int rp= bp;   //largest
        int n = num.size();
        while(lp!=rp){
            if(num.get(lp) + num.get(rp)==target){
                return true;
            }
            if(num.get(lp)+num.get(rp)<target){
                lp= (lp+1)%n;
            }
            else{
                rp= (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(11);
        num.add(15);
        num.add(6);
        num.add(8);
        num.add(9);
        num.add(10);
        int target = 16;
        System.out.println(find(num, target));
    }
}
