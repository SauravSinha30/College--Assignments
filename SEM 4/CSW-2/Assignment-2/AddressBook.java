import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Address {
    private int plotNo;
    private String at;
    private String post;

    public Address(int plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Plot No: " + plotNo + ", At: " + at + ", Post: " + post;
    }
}
public class AddressBook {
    public static void main(String[] args) {
        TreeMap<String, Address> addressBook = new TreeMap<>();

        addressBook.put("Alice", new Address(101, "Greenwood Avenue", "Springfield"));
        addressBook.put("Bob", new Address(102, "Maple Street", "Greenville"));
        addressBook.put("Charlie", new Address(103, "Pine Road", "Lakeside"));

        System.out.println("Entries in the address book:");
        Iterator<Map.Entry<String, Address>> iterator = addressBook.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Address> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Address: " + entry.getValue());
        }
    }
}
