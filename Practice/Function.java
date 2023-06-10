public class Function {
    public static void Print(){
        System.out.println("hello world");
    }
    
    public static int sum(int x,int y){
        int sum = x+y;
        return sum;
    }
    public static void swap(int a ,int b){
        int temp =a ;
        a = b;
        b =temp;
        System.out.println(a);
        System.out.println(b);
    } 
    public static int product(int a,int b){
        int product = a*b;
        return product;
    }

    public static int factorial (int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact *=i;
        }
        return fact;
    }
    public static void binomial(int n,int r){
        int bino = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(bino);
    }
    public static boolean isprime(int n){
        boolean isprime = true;
        // for (int i=2;i<=n-1;i++)
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    public static void Primerange(int n){
        for(int i=1;i<=n;i++){
            if(isprime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void palindrome(int n){
        int rev=0;
        int pow=0;
        while(n>0){
            int lastd = n%10;
            rev += lastd*(int)Math.pow(10,pow);
            pow++;
            n=n/10;
        }
       if(n==rev){
        System.out.println("Palindrome");
       }
       else{
        System.out.println("Not Palindrome");
       }
    }

    public static void main(String args[]){
        Print();
        int a =12;
        int b= 13;
        System.out.println(sum (a,b));
        swap(a,b);
        int multi = product(2,5);
        System.out.println(multi);
        System.out.println(factorial(25));
        binomial(5,2);
        System.out.println(isprime(2));
        Primerange(13);
        palindrome(101);

    }
}
