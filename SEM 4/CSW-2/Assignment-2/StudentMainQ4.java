import java.util.Scanner;

class Students implements Comparable<Students> {
    private String name;
    private String rollNumber;
    private int totalMark;
    public Students(String name, String rollNumber, int totalMark) {
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
    public int compareTo(Students other) {
        return Integer.compare(this.totalMark, other.totalMark);
    }

    public static Students searchStudent(Students[] students, String rollNumber) {
        for (Students student : students) {
            if (student.getRollNumber().equals(rollNumber)) {
                return student;
            }
        }
        return null;
    }
}

public class StudentMainQ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Students[] students = {
                new Students("Zoya", "101", 85),
                new Students("Bob", "102", 90),
                new Students("Charlie", "103", 78)
        };

        System.out.print("Enter Roll Number to search: ");
        String searchRoll = scanner.nextLine();
        Students foundStudent = Students.searchStudent(students, searchRoll);

        if (foundStudent != null) {
            System.out.println("Student Found: " + foundStudent);
        } else {
            System.out.println("Student Not Found");
        }
    }
}
