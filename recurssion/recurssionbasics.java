public class recurssionbasics {
    //print in decreasing order
    public static void printdec(int n){
        if(n==1){
            System.out.print("1");
            return;
        }
        else{
            System.out.print(n+" ");
        }
        printdec(n-1);
    }
    //print in increasing order from 1 to n
    public static void printinc(int n){
        if(n==1){
            System.out.print("1 ");
            return;
        }
        printinc(n-1);
        System.out.print(n+" ");
    }
    //print factorial
    public static int factorial(int n) {
        int fact=1;
        if (n == 0) {
            return 1;
        }
        fact = n * factorial(n-1);
        return fact;
    }
    //sum of n natural number
    public static int sumofn(int n){
        int sum=1;
        if(n==1){
            return 1;
        }
        sum = n+sumofn(n-1);
        return sum;
    }
    
    public static void main(String[] args) {
        printdec(10);
        System.out.println();
        printinc(5);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println(sumofn(10));

    }
}
