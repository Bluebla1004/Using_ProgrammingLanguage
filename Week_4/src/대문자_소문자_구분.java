import java.util.Scanner;

public class 대문자_소문자_구분 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("문자 입력 : ");
        char ch = keyboard.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            if (ch >= 'a' && ch <= 'z') {
                System.out.printf("입력문자 %s는 대문자이고, 소문자로 변경하면 %s입니다.", ch, (char)(ch - 32));
            }
            else {
                System.out.printf("입력문자 %s는 대문자이고, 소문자로 변경하면 %s입니다.", ch, (char)(ch + 32));
            }
        }
        else {
            System.out.println("영문자가 아닙니다.");
        }
    }
}
