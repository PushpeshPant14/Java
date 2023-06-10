public class basicclass {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setcolor("yellow");
        // p1.settipsize(5);
        // System.out.println(p1.getcolor());
        // p1.color="blue";
        // System.out.println(p1.color);  
        Student s1 = new Student("Pushpesh Pant");
        System.out.println(s1.name);
        
    }
}

class Student{
   String name;
   int rollno;
   Student( String name){  //constructor
       this.name=name;
       System.out.println("abc");
   }
}

class Pen{
    String color;
    int tip;
    String getcolor(){
        return this.color;
    }
    void setcolor(String newcolor){
        this.color = newcolor;
    }
    int gettip(){
        return this.tip;
    }
    void settipsize(int size){
        this.tip = size;
    }
}

class bank{
    public String username;
    private String Password;
    void setusername(String newname){
        username = newname;
    }
    public void setpassword(String pass){
        Password = pass;
        System.out.println(Password);
    }
}


