import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start date (YYYY-MM-DD)");
        LocalDate start = LocalDate.parse(sc.nextLine());
        System.out.println("Enter end date (YYYY-MM-DD)");
        LocalDate end = LocalDate.parse(sc.nextLine());
        long days = ChronoUnit.DAYS.between(start,end);
        System.out.println("Days Between:"+days);
        
    }
}
