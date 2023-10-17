import java.util.Scanner;

public class 큰수찾기_3개 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num1, num2, num3, max;

        System.out.print("3개의 수 입력: ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();

        /*
        if (num1 > num2) {
            if (num1 > num3) {
                max = num1;
            } else {
                max = num3;
            }
        } else if (num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
         */

        if (num1 > num2) max = num1;
        else if (num2 > num3) max = num2;
        else max = num3;

        System.out.printf("입력 받은 %d, %d, %d 중 큰수는 %d 입니다.", num1, num2, num3, max);
    }
}

