import java.util.LinkedList;
import java.util.Scanner;

class Student3 {
    private String name;
    private int age;
    private double mark;
    public Student3(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
       Student3 student = (Student3) obj;
        return age == student.age && Double.compare(student.mark, mark) == 0 && name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Student{Name='" + name + "', Age=" + age + ", Mark=" + mark + "}";
    }
}
public class StudentList {
    public static void main(String[] args) {
        LinkedList<Student3> students = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding Student objects
        students.add(new Student3("Zoya", 20, 85.5));
        students.add(new Student3("Raj", 22, 78.0));
        students.add(new Student3("Ram", 19, 90.2));

        // (a) Display the list of students
        System.out.println("List of Students:");
        for (Student3 student : students) {
            System.out.println(student);
        }

        // (b) Checking existence of a Student object
        System.out.println("\nEnter name, age, and mark to search for a student:");
        String name = scanner.next();
        int age = scanner.nextInt();
        double mark = scanner.nextDouble();
       Student3 searchStudent = new Student3(name, age, mark);
        if (students.contains(searchStudent)) {
            System.out.println("Student exists in the list (content comparison).");
        } else {
            System.out.println("Student not found.");
        }

        // (c) Remove a specified Student object
        System.out.println("\nEnter name, age, and mark of the student to remove:");
        String removeName = scanner.next();
        int removeAge = scanner.nextInt();
        double removeMark = scanner.nextDouble();
       Student3 removeStudent = new Student3(removeName, removeAge, removeMark);
        if (students.remove(removeStudent)) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found in the list.");
        }

        // (d) Count number of students
        System.out.println("\nTotal number of students: " + students.size());
    }
}
