import java.util.Scanner;

public class 양수_음수_구하기 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        char result;
        String result1;

        System.out.print("정수 입력:");
        num = keyboard.nextInt();

        result = num == 0 ? '0' : (num > 0 ? '양' : '음');
        result1 = result == '0' ?
                String.format("%c 입니다", result) :
                String.format("%c수 입니다", result);

        System.out.printf("입력 받은 정수 %d는 %s", num, result1);
    }
}
