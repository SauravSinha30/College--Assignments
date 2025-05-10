import java.util.function.*;
public class Q5 {
    public static Function<Integer,Integer> getSquare(){
        return num -> num*num;
    }
    public static void main(String[] args) {
        Function<Integer,Integer> f=getSquare();
        System.out.println("Square is:"+f.apply(5));
    }
}
