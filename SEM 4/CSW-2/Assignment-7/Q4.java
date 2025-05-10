interface Shape {
    double area();
    default void printArea() {
        System.out.println("Area: " + area());
    }
}
public class Q4 {
    public static void main(String[] args) {
        Shape circle=() -> Math.PI*3*3;
        Shape square=() -> 4*4;
        Shape rectangle=() ->4*6;

        circle.printArea();
        square.printArea();
        rectangle.printArea();
    }
}
