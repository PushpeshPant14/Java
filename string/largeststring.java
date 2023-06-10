public class largeststring {
    public static void main(String[] args) {
        String fruit[]={"apple","mango","banana"};   //lexicographical order
        String largest = fruit[0];
        for(int i=1;i<fruit.length;i++){
            if(largest.compareTo(fruit[i])<0){      //compareto ignore case
                largest = fruit[i];
            }
        }
        System.out.println(largest);
    }
}
