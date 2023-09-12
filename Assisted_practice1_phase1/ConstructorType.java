package contructortype;
class Student {
    private String name;
    private int age;

    // Default constructor (no-argument constructor)
    public Student() {
        System.out.println("Default constructor called.");
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        System.out.println("Parameterized constructor called.");
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

   

public class ConstructorType {
	public static void main(String[] args) {
        // Create an instance of Student using the default constructor
        Student student1 = new Student();
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 Age: " + student1.getAge());

        // Create an instance of Student using the parameterized constructor
        Student student2 = new Student("Alice", 20);
        System.out.println("\nStudent 2 Name: " + student2.getName());
        System.out.println("Student 2 Age: " + student2.getAge());
    }
}
