public class operation {
    //get
    public static int GETIthbit(int n,int i){
        int bitmask =1<<i;
        if((n&(bitmask))==0){
            return 0;
        }
        return 1;
    }
    //set 0 to 1
    public static int SETithbut(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    //clear 1 to 0
    public static int clearithbut(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    //update
    public static int updateithbit(int n,int i,int newbit){
        if(newbit==0){
            int bitmask = ~(1<<i);
            return n&bitmask;
        //    return clearithbut(n,i);
        }
        else{
            int bitmask = 1<<i;
            return n|bitmask;
        //    return SETithbut(n, i);
        }
    }

    //update method 2
    public static int update2(int n,int i,int newbit){
        n=clearithbut(n, i);
        int bitmask = newbit<<i;
        return n|bitmask;
    }
    public static void main(String[] args) {
        System.out.println(update2(10,1,1));
    }
}
