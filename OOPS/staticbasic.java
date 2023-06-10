public class staticbasic {
    public static void main(String[] args) {
        // student s1 = new student();
        // s1.schoolname = "vm";
        // student s2 = new student();
        // s2.name="pushpesh";
        // System.out.println(s2.schoolname);

    }
}

class student1{
    String name;
    int rollno;
    // public static String schoolname;
    void setname(String name){
        this.name = name;
    }
    String getname(){
        return name;
    }
    void setrollno(int rollno){
        this.rollno = rollno;
    }
    int getrollno(){
        return rollno;
    }
}