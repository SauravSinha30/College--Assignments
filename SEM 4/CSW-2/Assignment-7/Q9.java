import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start date(YYYY-MM-DD)");
        LocalDate start = LocalDate.parse(sc.nextLine());
        System.out.println("Enter initial amount:");
        double amount = sc.nextDouble();
        LocalDate now = LocalDate.now();
        long days = ChronoUnit.DAYS.between(start,now);
        double interest = (amount * 8 * days) / (100*365) ;
        System.out.println("Total Amount:"+(amount + interest));
    }
}
