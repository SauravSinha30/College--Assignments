class College {
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }

    @Override
    public String toString() {
        return "College [Name=" + collegeName + ", Location=" + collegeLoc + "]";
    }
}
class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public College getCollege() {
        return college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled in: " + college);
    }
}
public class MainApp {
    public static void main(String[] args) {


        College college1 = new College("ABC College", "New York");
        College college2 = new College("XYZ University", "Los Angeles");

        Student student1 = new Student(101, "John Doe", college1);
        Student student2 = new Student(102, "Jane Smith", college2);

        System.out.println("Student Details:");
        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();
    }

}
