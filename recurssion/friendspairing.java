public class friendspairing {
    public static int friendspairingproblem(int n){
        if(n==0||n==1){
            return 1;
        }
        return friendspairingproblem(n-1)+ (n-1)*friendspairingproblem(n-2);
    }
    public static void main(String[] args){
        int ans =friendspairingproblem(4);
        System.out.println(ans);
    }
}