import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class 성적프로그램 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double Spending, Saving;
            System.out.print("지출금: ");
            Spending = scanner.nextDouble();

            System.out.print("저축금: ");
            Saving = scanner.nextDouble();

            // 식 생활비 계산
            double foodExpense = Spending - Saving;

            // 엥겔 지수 계산
            double engelIndex = (foodExpense / Spending) * 100;

            String engelIndexCategory;

            // 엥겔 지수 판정
            if (engelIndex <= 30) {
                engelIndexCategory = "상류층";
            } else if (engelIndex <= 50) {
                engelIndexCategory = "중산층";
            } else {
                engelIndexCategory = "하류층";
            }

            System.out.println("식 생활비: " + foodExpense);
            System.out.println("엥겔 지수: " + engelIndex);
            System.out.println("엥겔 지수 판정: " + engelIndexCategory);

        }
    }
}