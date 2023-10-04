import java.util.Scanner;
import java.text.DecimalFormat;

public class 돈_금액나누기 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int fifty_thousand, ten_thousand, five_thousand, one_hundred, ten, five, one, won;
        DecimalFormat format = new DecimalFormat("#,###");

        System.out.print("금액을 입력해주세요: ");
        won = keyboard.nextInt();
        System.out.printf("money = %s\n", format.format(won));

        fifty_thousand = won / 50000;
        won %= 50000;

        ten_thousand = won / 10000;
        won %= 10000;

        five_thousand = won / 5000;
        won %= 5000;

        one_hundred = won / 100;
        won %= 100;

        ten = won / 10;
        won %= 10;

        five = won / 5;
        won %= 5;

        one = won;

        System.out.printf("5만원 = %d\n", fifty_thousand);
        System.out.printf("1만원 = %d\n", ten_thousand);
        System.out.printf("5천원 = %d\n", five_thousand);
        System.out.printf("100원 = %d\n", one_hundred);
        System.out.printf("10원 = %d\n", ten);
        System.out.printf("5원 = %d\n", five);
        System.out.printf("1원 = %d\n", one);
    }
}
