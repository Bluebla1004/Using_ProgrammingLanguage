import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String school;

        System.out.print("학교명 입력:");
        school = keyboard.nextLine();
        System.out.println("학교명: " + school);
    }
}
