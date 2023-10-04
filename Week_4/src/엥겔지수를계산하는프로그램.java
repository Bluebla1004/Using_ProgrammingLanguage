import java.util.Scanner;

public class 엥겔지수를계산하는프로그램 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double Spending, Saving, LivingExpenses, engel;

        System.out.print("지출금: ");
        Spending = keyboard.nextDouble();

        System.out.print("저축금: ");
        Saving = keyboard.nextDouble();

        LivingExpenses = Spending - Saving;

        engel = (LivingExpenses / Spending) * 100;

        String engelLivingExpenses;

        // 엥겔 지수 판정
        if (engel <= 30) {
            engelLivingExpenses = "상류층";
        } else if (engel <= 50) {
            engelLivingExpenses = "중산층";
        } else {
            engelLivingExpenses = "하류층";
        }

        System.out.printf("식 생활비: %.2f", LivingExpenses);
        System.out.printf("엥겔 지수: %.2f", engel);
        System.out.printf("엥겔 지수 판정: %s", engelLivingExpenses);

    }
}
