public class abtractclass {
    public static void main(String[] args) {
        // horse h = new horse();
        // h.eat();
        // h.walk();
        mustang m = new mustang(); //constructor call 
        //animal->horse->mustang
        m.eat();
    }
}

abstract class animal{
    animal(){
        System.out.println("animal");
    }
    void eat(){

        System.out.println("eats animal");
    }

    abstract void walk();   //declaration will be in subclass
}

class horse extends animal{
    horse(){
        System.out.println("horse");
    }
    void walk(){                                 //after inheriting the animal class its is necessary to declare abstract function
        System.out.println("walk on 4 legs");
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("mustang");
    }
}
