public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;

    // Default Constructor // attr. -> garbage
    public Student(){
        System.out.println("Student Default Constructor Called");
    }

    // Parameterized Constructor
    public Student(int id, String name, int age, int nos, String gf){
        System.out.println("Student Parameterized Constructor Called");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
        this.gf = gf;
    }

    // Copy Constructor
    public Student(Student copy){
        System.out.println("Student Copy Constructor Called");
        this.id = copy.id;
        this.name = copy.name;
        this.age = copy.age;
        this.nos = copy.nos;
    }

    public void Study(){
        System.out.println(name + " Studying");
    }

    public void Sleep(){
        System.out.println(name + " Sleeping");
    }

    public void Bunk(){
        System.out.println(name + " Bunking");
    }

    private void gfChatting(){
        System.out.println(name + "gfChatting");
    }
}
