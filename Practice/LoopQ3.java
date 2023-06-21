import java.util.Scanner;

public class LoopQ3 {
    // public static void main(String args[]){
    //     int n=5;
    //     int fact=1;
    //     for(int i=5;i>=1;i--){
    //         fact *=i;
    //     }
    //     System.out.println("factorial of "+n+" is "+fact);
    // }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
    if((n>=-100)&&(n<=100))
    {
       String s = String.valueOf(n);
       System.out.println(s);
       System.out.println("Good job") ;
    }
    }
}

