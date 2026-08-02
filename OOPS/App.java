public class App{
    public static void main(String[] args) {
        // Default Constructor
    //     Student A = new Student();
    //     A.id = 1;
    //     A.age = 18;
    //     A.name = "Rajan";
    //     A.nos = 5;
    //     System.out.println(A.id);
    //     System.out.println(A.name);
    //     System.out.println(A.age);
    //     System.out.println(A.nos);

    //     A.Bunk();
    //     A.Sleep();
    //     A.Study();

    // Parameterized Constructor
    Student A = new Student(1, "Rajan", 18, 3, "Tina");
        System.out.println(A.id);
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.nos);

        A.Bunk();
        A.Sleep();
        A.Study();

    // Copy Constructor
    Student B = new Student(A);
        A.name = "raj"; // Updating the name 
        System.out.println(A.id);
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.nos);
    }
}