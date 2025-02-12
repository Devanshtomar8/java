// University Class
class University {
    static String universityName = "Global University"; // Static variable
    String studentName; // Non-static variable

    // Constructor
    public University(String studentName) {
        this.studentName = studentName;
    }

    // Static method to display university name
    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    public String getStudentName() {
        return studentName;
    }

    public static String getUniversityName() {
        return universityName;
    }
}

// Main Class to demonstrate functionality
public class University {
    public static void main(String[] args) {
        // Create student objects
        University student1 = new University("Alice");
        University student2 = new University("Bob");
        University student3 = new University("Charlie");

        // Display university name
        University.displayUniversityName();

        // Display student names
        System.out.println("Student 1: " + student1.studentName);
        System.out.println("Student 2: " + student2.studentName);
        System.out.println("Student 3: " + student3.studentName);

        // Change university name
        University.universityName = "New Global University";
        University.displayUniversityName(); // Display updated university name
    }
    }
}