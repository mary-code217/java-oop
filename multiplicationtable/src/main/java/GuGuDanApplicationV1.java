import java.util.Scanner;
import java.util.stream.Stream;

public class GuGuDanApplicationV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while(!end) {
            try {
                int dan = InputValue.consoleInputValue(sc);

                Validation.validDan(dan);

                Calculator.calculateGuGuDan(dan);

                end = PlayHandler.playOrEnd(sc);
            } catch (Exception e) {
                Validation.clearInputValue(sc);
            }
        }
    }
}
