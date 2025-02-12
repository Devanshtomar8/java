// Course Class
class Course {
    private String courseName; // Course name
    private String courseCode;  // Course code

    // Constructor
    public Course(String courseName, String courseCode) {
        this.courseName = courseName; // 'this' keyword to differentiate
        this.courseCode = courseCode;  // 'this' keyword to differentiate
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName + ", Course Code: " + courseCode);
    }

    public String getCourseName() {
        return courseName;
    }
}

// Main Class to demonstrate functionality
public class CourseRegistrationDemo {
    public static void main(String[] args) {
        // Create a Course object
        Course course = new Course("Introduction to Programming", "CS101");
        
        // Display course details
        course.displayCourseDetails();
    }
}