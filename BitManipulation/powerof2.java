public class powerof2 {
    public static boolean poweroftwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
       System.out.println(poweroftwo(4));
    }
}
