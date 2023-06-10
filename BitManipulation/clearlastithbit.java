public class clearlastithbit {
    public static int clearlastbits(int n,int i){
        int bitmask = ~0<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
     System.out.println(clearlastbits(15,2));
    }
}
