public class optimisedpower {
    public static int optimised(int x,int n){
        if(n==0){
            return 1;
        }
        // int halfsq = optimised(x, n/2)*optimised(x, n/2);
        int half = optimised(x, n/2);
        int halfsq = half*half;

        if(n%2 != 0){
            halfsq*=x;
        }
        return halfsq;
    }
    public static void main(String[] args) {
        int ans =optimised(2, 5);
        System.out.println(ans);
    }
}
