interface EnrollmentSystem {
    void enrolling(Student1 student, Course course);
    void dropping(Student1 student, Course course);
    void displayEnrollmentDetails();
}
class Course {
    private String courseId;
    private  String courseName;
    private Student1[] students;
    private int studentCount;
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new Student1[30];
        this.studentCount = 0;
    }
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Student1[] getStudents() {
        return students;
    }

    public void addStudent(Student1 student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        }
    }

    public void removeStudent(Student1 student) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].equals(student)) {
                students[i] = students[--studentCount];
                students[studentCount] = null;
                break;
            }
        }
    }
    @Override
    public String toString() {
        return "Course [ID=" + courseId + ", Name=" + courseName + "]";
    }
}

class Student1 {
    private String studentId;
    private String studentName;
    private Course[] courses;
    private int courseCount;

    public Student1(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courses = new Course[10];
        this.courseCount = 0;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public Course[] getCourses() {
        return courses;
    }
    public void addCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount++] = course;
        }
    }
    public void removeCourse(Course course) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].equals(course)) {
                courses[i] = courses[--courseCount];
                courses[courseCount] = null;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Student [ID=" + studentId + ", Name=" + studentName + "]";
    }
}

class Enrollment implements EnrollmentSystem {
    @Override
    public void enrolling(Student1 student, Course course) {
        student.addCourse(course);
        course.addStudent(student);
        System.out.println(student.getStudentName() + " has been enrolled in " + course.getCourseName());
    }
    @Override
    public void dropping(Student1 student, Course course) {
        student.removeCourse(course);
        course.removeStudent(student);
        System.out.println(student.getStudentName() + " has been dropped from " + course.getCourseName());
    }
    @Override
    public void displayEnrollmentDetails() {
        System.out.println("Enrollment details are displayed here.");
    }
}
public class MainEnrollApp {
    public static void main(String[] args) {

        Student1 student1 = new Student1("S001", "Alice");
        Student1 student2 = new Student1("S002", "Bob");

        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Physics");

        // Demonstrates loose coupling by using the EnrollmentSystem interface
        EnrollmentSystem e = new Enrollment();

        e.enrolling(student1, course1);
        e.enrolling(student1, course2);
        e.enrolling(student2, course1);

        System.out.println("\nEnrollment Details :");
        for (Course course : student1.getCourses()) {
            if (course != null) {
                System.out.println(student1 + " is enrolled in " + course);
            }
        }

        for (Course course : student2.getCourses()) {
            if (course != null) {
                System.out.println(student2 + " is enrolled in " + course);
            }
        }

        e.dropping(student1, course1);
        System.out.println("\nEnrollment Details After Dropping :");
        for (Course course : student1.getCourses()) {
            if (course != null) {
                System.out.println(student1 + " is enrolled in " + course);
            }
        }
        for (Course course : student2.getCourses()) {
            if (course != null) {
                System.out.println(student2 + " is enrolled in " + course);
            }
        }
    }
}
