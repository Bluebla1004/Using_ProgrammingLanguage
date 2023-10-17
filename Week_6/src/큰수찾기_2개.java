import java.util.Scanner;

public class 큰수찾기_2개 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num1, num2, max;

        System.out.print("2개의 수 입력");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        if (num1 > num2)
            max = num1;
        else
            max = num2;


        System.out.printf("입력 받은 %d, %d중 큰수는 %d 입니다.", num1, num2, max);

    }
}
