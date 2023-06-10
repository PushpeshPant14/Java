public class interfaceMultiple {
    public static void main(String[] args) {
        beer b = new beer();
        b.eatherb();
        b.eatmeat();
    }
}

interface herbivore{
    void eatherb();
}

interface carnivores{
    void eatmeat();
}

class beer implements herbivore , carnivores{
    public void eatherb(){
        System.out.println("herb");
    }
    public void eatmeat(){
        System.out.println("meat");
    }
}