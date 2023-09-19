import java.util.Scanner;

public class Salary_Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int money, pay, time, salary;
        final int WEEK = 7;

        System.out.print("현재 지갑에 얼마가 있나요? :");
        money = keyboard.nextInt();
        System.out.print("시간당 임금이 얼마인가요? :");
        pay = keyboard.nextInt();
        System.out.print("몇시간 일했나요? :");
        time = keyboard.nextInt();

        salary = pay * time * WEEK;

        System.out.printf("\n현재 지갑의 돈 : %,d 원\n", money);
        System.out.printf("시간당 임금 : %,d 원\n", pay);
        System.out.printf("하루에 %d시간 일했습니다\n", time);
        System.out.printf("일주일치 급료 %,d 원\n", salary);
        System.out.printf("나의 총 금액 : %,d 원\n", salary + money);
    }
}

