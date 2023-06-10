public class tilingproblem {

    public static int tilingproblem1(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        //vertical
        // int vertical = tilingproblem(n-1);
        // //horizontal
        // int horizontal = tilingproblem(n-2);
        // int ways = horizontal + vertical;
        // return ways;
        return tilingproblem1(n-1)+tilingproblem1(n-2);

    }

    public static void main(String[] args) {
        System.out.println(tilingproblem1(4));
    }
}
