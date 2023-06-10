import java.util.Arrays;

public class stringq4 {
    public static void main(String[] args) {
        String str1="earth";
        String str2="heart";
        //converting both string to same case either upper or lower
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //length same honi chaiye
        if(str1.length()==str2.length()){
            //
            //string into array
            char str1toarray[]=str1.toCharArray();
            char str2toarray[]=str2.toCharArray();
            //sorting array
            Arrays.sort(str1toarray);
            Arrays.sort(str2toarray);
            //comparing both array
            boolean result = Arrays.equals(str1toarray, str2toarray);
            if(result==true){
                System.out.println("Both string are anagram");
            }
            else{
                System.out.println("Not anagrams");
            }
            
        }
        else{
            System.out.println("Length he same nhi hai anagram kaha sai honge");
        }
       
        
    }
}
