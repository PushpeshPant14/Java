public class stringcompression {
    //using string builder
    public static String stringcomSB(String str){        
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1&& str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            count.toString();
            if(count>1){
            sb.append(count);
            }
        }
        
        return sb.toString();
    }
    //without string builder
    public static String stringcomWSB(String str){
        String S1="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1&& str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            S1+=str.charAt(i);
            count.toString();
            if(count>1){
                S1+=count;
            }
        }
        return S1;
    }
    public static void main(String[] args) {
        String str = "aaabbccdd";
        System.out.println(str.length());
        System.out.println(stringcomSB(str));
        System.out.println(stringcomWSB(str));
    }
}
