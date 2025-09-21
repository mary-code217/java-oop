import java.util.Scanner;

public class Validation {
    public static void validDan(int dan) throws Exception {
        if(dan<1 || dan>9) throw new Exception("단은 1~9 사이여야 합니다.");
    }

    public static void clearInputValue(Scanner sc) {
        System.out.println("1~9의 숫자만 입력가능합니다.");
        sc.nextLine();
    }
}
