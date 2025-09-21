import java.util.Scanner;

public class InputValue {
    public static int consoleInputValue(Scanner sc) {
        System.out.println("알고 싶은 구구단의 단을 입력해주세요!(1~9단)");
        System.out.print("입력 : ");
        return sc.nextInt();
    }
}
