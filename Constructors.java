public class Constructors  {
    private String name;
    private int age;
    private char grade;


    public Constructors() {
        name = "Anuja";
        age = 21;
        grade = 'A';
    }


    public Constructors(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public Constructors(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 'N';
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

class Main {
    public static void main(String[] args) {
        Constructors Obj1 = new Constructors();
        System.out.println("Student 1 ");
        Obj1.displayInfo();
        System.out.println();

        Constructors Obj2 = new Constructors("Heshan", 22, 'B');
        System.out.println("Student 2 ");
        Obj2.displayInfo();
        System.out.println();


        Constructors Obj3 = new Constructors("Hiruvinda", 20);
        System.out.println("Student 3 ");
        Obj3.displayInfo();
    }
}