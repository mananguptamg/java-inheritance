// Superclass Course
class Course {
    protected String courseName;
    protected int duration; // in weeks

    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass OnlineCourse (Extends Course)
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    // Constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding displayCourseInfo method
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded Sessions: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass PaidOnlineCourse (Extends OnlineCourse)
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // in percentage

    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Overriding displayCourseInfo method
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Course Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price After Discount: " + finalPrice);
    }
}

// Main class
public class CourseSystem {
    public static void main(String[] args) {
        // Creating instances of different course levels
        Course basicCourse = new Course("Java Basics", 4);
        OnlineCourse onlineCourse = new OnlineCourse("Core Java", 6, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Springboot", 10, "Coursera", true, 200, 20);

        // Displaying course details
        System.out.println("Course Details:");
        System.out.println();
        basicCourse.displayCourseInfo();
        System.out.println();
        onlineCourse.displayCourseInfo();
        System.out.println();
        paidCourse.displayCourseInfo();
    }
}

//SampleOutput
//Course Details:
//
//Course Name: Java Basics
//Duration: 4 weeks
//
//Course Name: Core Java
//Duration: 6 weeks
//Platform: Udemy
//Recorded Sessions: Yes
//
//Course Name: Java Springboot
//Duration: 10 weeks
//Platform: Coursera
//Recorded Sessions: Yes
//Course Fee: 200.0
//Discount: 20.0%
//Final Price After Discount: 160.0