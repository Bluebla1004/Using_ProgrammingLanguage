import java.io.IOException;
import java.util.Scanner;

public class 세금계산 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        int salary, tax;

        do {
            System.out.print("당신의 급여 입력: ");
            salary = keyboard.nextInt();
            if (salary >= 0 && salary <= 30000000) {
                break;
            } else {
                System.err.print("급여 입력 오류");
                System.in.read();
            }
        } while (true);

        if (salary < 2000000) {
            tax = 0;
        } else if (salary <= 4000000) {
            tax = (int) ((salary - 20000000) * 10 / 100.0);
        } else if (salary <= 6000000) {
            tax = (int) ((salary - 20000000) * 8 / 100.0);
        } else if (salary <= 20000000) {
            tax = (int) ((salary - 20000000) * 6 / 100.0);
        } else {
            tax = (int) ((salary - 20000000) * 5 / 100.0);
        }
        
        System.out.printf("당신의 급여는 %,d원 이고 세금은 %,d원입니다", salary, tax);
    }
}
