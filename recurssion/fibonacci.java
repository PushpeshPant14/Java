public class fibonacci {
    static int fibonacci1(int n){
        if(n==0||n==1){
            return n;
        }
        int fib = fibonacci1(n-1)+fibonacci1(n-2);
        return fib;
    }
    public static void main(String[] args) {
        // fibonacci value at nth location
        System.out.println(fibonacci1(10));
        // fibonanci series upto n
        for(int i=0;i<10;i++){
            System.out.print(fibonacci1(i)+" ");
        }
        // System.out.println();
        // int count=0;
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=n-i;j>=1;j--){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("  "+count+" ");
        //         count++;
        //     }
        //     System.out.println();
        // }

    }
}
