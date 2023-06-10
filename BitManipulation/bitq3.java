public class bitq3 {
    public static void main(String[] args) {
        char ch ;
        for(ch='A';ch<='Z';ch++){
            System.out.println(ch);
            System.out.println((int)(ch)); //65 to 90 for uppercase
            //trick
            System.out.println((char)(ch|' ')); //type cast bit in char /
            System.out.println((ch|' ')); //97 to 122 for lowercase
            
        }

    }
}
