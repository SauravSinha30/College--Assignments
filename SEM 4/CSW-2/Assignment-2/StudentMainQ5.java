import java.util.Arrays;
class Student2 implements Comparable<Student2> {
    private String name;
    private String rollNumber;
    private int totalMark;

    public Student2(String name, String rollNumber, int totalMark) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getTotalMark() {
        return totalMark;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + ", Roll Number: " + rollNumber + ", Total Mark: " + totalMark;
    }

    @Override
    public int compareTo(Student2 other) {
        return this.rollNumber.compareTo(other.rollNumber);
    }
}
public class StudentMainQ5 {
    public static void bubbleSort(Student2[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    // Swap students[j] and students[j + 1]
                    Student2 temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Creating an array of Student objects
        Student2[] students = {
                new Student2("Zoya", "103", 85),
                new Student2("Raj", "101", 90),
                new Student2("Charlie", "102", 78)
        };

        // Sorting students using Bubble Sort
        bubbleSort(students);

        // Displaying sorted students
        System.out.println("Students sorted by Roll Number:");
        for (Student2 student : students) {
            System.out.println(student);
        }
    }
}
