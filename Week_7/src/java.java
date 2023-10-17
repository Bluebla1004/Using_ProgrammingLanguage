import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int score;
        do {
            System.out.print("Java 성적입력: ");
            score = keyboard.nextInt();

            if (score >= 0 && score <= 100) {
                break;
            } else {
                System.err.println("점수 오류");
            }
        } while (true);

    }
}