import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class ArrayListUser {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();

        userList.add(new User("Zoya", 25));
        userList.add(new User("Raj", 22));
        userList.add(new User("Champak", 30));
        userList.add(new User("Bhide", 27));

        System.out.println("Original list of users:");
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }

        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return Integer.compare(u1.getAge(), u2.getAge());
            }
        });

        System.out.println("\nSorted list of users by age:");
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
}
