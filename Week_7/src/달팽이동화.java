import java.util.Scanner;

public class 달팽이동화 {
    public static void main(String[] args) {
        int 달팽이 = 0;
        int day = 0;

        while (true) {
            달팽이 += 55;

            day++;
            if (달팽이 >= 300) {
                System.out.printf("달팽이는 %d일만에 우물에서 나왔다", day);
                break;
            } else {
                달팽이 -= 13;
            }
        }
    }
}
