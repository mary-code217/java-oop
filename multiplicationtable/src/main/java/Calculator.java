import java.util.stream.Stream;

public class Calculator {

    public static void CalculateGuGuDan(int dan) {
        Stream.of(1,2,3,4,5,6,7,8,9).forEach(x -> System.out.println(dan + " x " + x + " = " + (dan * x)));
    }
}
