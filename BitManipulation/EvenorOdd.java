public class EvenorOdd {
    public static void evenorodd(int n){
        int bitmask = 1;
        if( (n&bitmask) ==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
       evenorodd(13);
       System.out.println(1&1);
    }
    
}
