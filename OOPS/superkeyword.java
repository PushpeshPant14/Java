public class superkeyword {
    public static void main(String[] args) {
        horse1 h = new horse1();
        System.out.println(h.color);
    }
}

class animal1{
    public String color;
    animal1(){
        System.out.println("animal");
    }

}

class horse1 extends animal1{
    horse1(){
        super();
        super.color="dark";
        System.out.println("horse");
    }
}
