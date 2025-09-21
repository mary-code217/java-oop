import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Calculator {
    public static void calculateGuGuDan(int dan) {
        IntStream.rangeClosed(1, 9).forEach(x -> System.out.println(dan + " x " + x + " = " + (dan * x)));
    }
}
