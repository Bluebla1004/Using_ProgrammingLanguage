import java.util.Scanner;

public class 성적프로그램만들기 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("JAVA 성적을 입력하세요 (0 ~ 100): ");
        int score = keyboard.nextInt();
        String grade;

        if (score >= 95 && score <= 100) {
            grade = "A+";
        } else if (score >= 90 && score < 95) {
            grade = "A0";
        } else if (score >= 85 && score < 90) {
            grade = "B+";
        } else if (score >= 80 && score < 85) {
            grade = "B0";
        } else if (score >= 75 && score < 80) {
            grade = "C+";
        } else if (score >= 70 && score < 75) {
            grade = "C0";
        } else if (score >= 65 && score < 70) {
            grade = "D+";
        } else if (score >= 60 && score < 65) {
            grade = "D0";
        } else {
            grade = "F";
        }

        System.out.println("학점: " + grade);

    }
}
