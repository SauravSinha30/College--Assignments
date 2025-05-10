import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Q8 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2025,5,10,10,30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Formatted:"+dt.format(formatter));
    }
}
