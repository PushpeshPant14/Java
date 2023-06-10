public class binarytodec {
    public static void bintodec(int n){
        int pow=0;
        int dec=0;
        while(n>0){
            int lastd = n%10;
            dec = dec + (lastd*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        bintodec(101);
    }
}