public class stringbuilder {
    public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        sb.toString();
        // Integer i=10;
        // System.out.println(i.toString()); //10 become string
        System.out.println(sb);
       
    }
}
