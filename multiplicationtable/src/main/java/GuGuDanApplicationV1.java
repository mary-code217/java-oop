import java.util.Scanner;
import java.util.stream.Stream;

public class GuGuDanApplicationV1 {
    public static void main(String[] args) {
        boolean isEnd = false;
        while(!isEnd) {
            try {
                int dan = InputValue.consoleInputValue();

                Validation.validDan(dan);

                Calculator.CalculateGuGuDan(dan);

                isEnd = PlayHandler.playOrEnd();
            } catch (Exception e) {
                Validation.ClearInputValue();
            }
        }
    }
}
