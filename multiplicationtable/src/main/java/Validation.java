import java.util.Scanner;

public class Validation {
    public static void validDan(int dan) throws Exception {
        if(dan<1 || dan>9) throw new Exception();
    }

    public static void ClearInputValue() {
        System.out.println("1~9의 숫자만 입력가능합니다.");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }
}
