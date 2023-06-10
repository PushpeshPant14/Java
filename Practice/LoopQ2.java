import java.util.*;
public class LoopQ2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum= 0;
        int oddsum =0;
        do{
            System.out.println("Enter number");
            number = sc.nextInt();
            if(number%2==0){
                evensum = evensum + number;
            }
            else{
                oddsum = oddsum + number;
            }
            System.out.println("if you want sum to continue press 1");
            choice = sc.nextInt();
        }
        while(choice==1);
        System.out.println("even sum is "+ evensum );
        System.out.println("odd sum is "+ oddsum);
        sc.close();
    }
}
