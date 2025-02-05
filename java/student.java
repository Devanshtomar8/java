// Student.java
public class Student {
    private String name;
    private int age;
    public Student() {
        this.name = "Default Name";
        this.age = 18;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // student details
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        //  default constructor
        Student student1 = new Student();
        student1.display();
        //  parameterized constructor
        Student student2 = new Student("Devansh", 20);
        student2.display();
    }
}
