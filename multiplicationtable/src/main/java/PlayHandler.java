import java.util.Scanner;

public class PlayHandler {
    public static boolean playOrEnd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("0을 입력하시면 구구단이 종료됩니다.\n계속하시려면 1을 입력해주세요");
        System.out.print("입력 : ");
        return sc.nextInt() == 0;
    }
}
