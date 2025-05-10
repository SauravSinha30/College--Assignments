interface Calculator{
    double operation(double a,double b);
}
public class Q2_Calculator {
    public static void main(String[] args) {
        Calculator add=(a,b) -> a+b;
        Calculator sub=(a,b) -> a-b;
        Calculator mul=(a,b) -> a*b;
        Calculator div=(a,b) -> a/b;

        System.out.println("Addition:"+add.operation(10,5));
        System.out.println("Subtraction:"+sub.operation(10,5));
        System.out.println("Multiplication:"+mul.operation(10,5));
        System.out.println("Division:"+div.operation(10,5));
    }
}
