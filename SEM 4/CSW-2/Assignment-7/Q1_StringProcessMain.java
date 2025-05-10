import java.util.function.*;
interface StringProcessor {
    int process(String input);
}
public class Q1_StringProcessMain {
    public static void main(String[] args) {
        StringProcessor f=str-> str.length();
        String s="Saurav";
        System.out.println("Length of the string is:"+f.process(s));
    }
}
