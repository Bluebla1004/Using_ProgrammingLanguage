import java.util.Scanner;

public class 큰수구하기 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, result;
        String result1;

        System.out.print("같지 않은 정수 2개 입력: ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        result = num1 == num2 ? 0 : num1 > num2 ? num1 : num2;
        result1 = result == 0 ? "같다" : String.format("%d이가 크다", result);

        System.out.printf("입력받은 정수1 = %d\n", num1);
        System.out.printf("입력받은 정수2 = %d\n", num2);
        System.out.printf("결과: %s\n", result1);

    }
}
