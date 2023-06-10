public class recQ2 {

    // You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  Use a recursive function to solve this problem.NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t be 0

    static String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void conversion(int n){
        if(n==0){
            return;
        }
        int lastdigit = n%10;    //lastdigit
        conversion(n/10);        //update number after using lastdigit 2019 - 201 - 20 - 2
        System.out.print(digit[lastdigit]+" ");       //stack analysis
    }
    public static void main(String[] args) {
        conversion(2019);
    }
}
