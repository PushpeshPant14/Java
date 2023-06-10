// import java.util.*;
public class basicstr {
    //strings are immutable
    public static void main(String[] args) {
        // String str = "abcd";
        // String str1 = new String("xyz");
        // Scanner sc = new Scanner(System.in);
        // String str2 = sc.nextLine();
        // System.out.println(str);
        // System.out.println(str1);
        // System.out.println(str2);
        // System.out.println(str2.length());

        //concatination
        String firstname = "Pushpesh";
        String Lastname = "Pant";
        String fullname = firstname + " " + Lastname;
        System.out.println(fullname);
        System.out.println(fullname.charAt(8));

        // sc.close();

        //COMPARE
        if(firstname.equals(Lastname)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

        //substring
        System.out.println(subString(fullname,4,8));
        //substring inbuilt func
        System.out.println(fullname.substring(0,5)); //last element is excluded

    }


public static String subString(String S1,int si,int ei){
    String substring = "";
    for(int i=si;i<ei;i++){
        substring += S1.charAt(i);
    }
    return substring;
}
}