public class permutation {
    public static void permutationstring(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recurssion
        for(int i=0;i<str.length();i++){
            char cur= str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            permutationstring(newstr,ans+cur);
        }
    }
    public static void main(String[] args) {
        String str ="abc";
        permutationstring(str,"");   
    }
}
