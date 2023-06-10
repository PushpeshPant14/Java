import java.util.*;
public class StringQ1 {
    public static void lowercasevowel(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
            
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        lowercasevowel(str);
        sc.close();
    }
}
