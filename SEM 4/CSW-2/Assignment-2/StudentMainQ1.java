class Student {
    private String name;
    private String rollNumber; // Accepts both integers and strings as a String type
    private int age;

    public Student(String name, String rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Age: " + age);
    }
}

public class StudentMainQ1 {
    public static void main(String[] args) {
        Student student1 = new Student("Zoya", "101", 20);
        Student student2 = new Student("Harsh", "A102", 22);

        System.out.println("Student Details:");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
