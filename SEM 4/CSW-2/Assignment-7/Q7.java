import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Q7 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate twoWeeksLater = now.plusWeeks(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println("Current:"+now);
        System.out.println("2 Weeks Later:"+twoWeeksLater);
        System.out.println("Formatted:"+now.format(formatter));
    }
}
