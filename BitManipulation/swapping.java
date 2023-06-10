public class swapping {
    //swapping without using 3rd variable;
    public static void main(String[] args) {
        int x=1;
        int y=6;
        System.out.println("value of x is "+x+"and y is"+y+"before swapping");
        //swapping using xor;
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("value after swaping, x is "+x+" and y is "+y);
        System.out.println(x+"is"+1+"is"+-~x);
    }
}
