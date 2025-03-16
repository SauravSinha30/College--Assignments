import java.util.Arrays;
import java.util.Comparator;

class Student4 {
    private String name;
    private String rollNo;
    private int age;

    public Student4(String name, String rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student3{Name='" + name + "', RollNo='" + rollNo + "', Age=" + age + "}";
    }
}

class RollNoComparator implements Comparator<Student4> {
    @Override
    public int compare(Student4 s1, Student4 s2) {
        return s1.getRollNo().compareTo(s2.getRollNo());
    }
}

class AgeComparator implements Comparator<Student4> {
    @Override
    public int compare(Student4 s1, Student4 s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}
public class StudentMainQ7 {
    public static void main(String[] args) {
        Student4[] students = {
                new Student4("Zoya", "103", 20),
                new Student4("Raj", "101", 22),
                new Student4("Charlie", "102", 21)
        };

        Arrays.sort(students, new RollNoComparator());
        System.out.println("Students sorted by Roll Number:");
        for (Student4 student : students) {
            System.out.println(student);
        }

        Arrays.sort(students, new AgeComparator());
        System.out.println("\nStudents sorted by Age:");
        for (Student4 student : students) {
            System.out.println(student);
        }
    }
}
