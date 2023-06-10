public class MaxSumKADANES {
    public static void kadanes(int number[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            cs += number[i];
            if(cs<0){       // for negative
                cs=0;
            }
            ms = Math.max(ms, cs);
        }
        if(ms==0){      
            int ms1=Integer.MIN_VALUE;                  //special case if all value  is in negative;
            for(int i=0;i<number.length;i++){           // i created it myself , i will forget what logic i used;
                int cs1=number[i];
                if(ms1<cs1)
                {
                    ms1=cs1;
                }
                ms=ms1;
            }
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4};
        kadanes(arr);
        
    }
}
