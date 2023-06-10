public class LoopQ3 {
    public static void main(String args[]){
        int n=5;
        int fact=1;
        for(int i=5;i>=1;i--){
            fact *=i;
        }
        System.out.println("factorial of "+n+" is "+fact);
    }
}
