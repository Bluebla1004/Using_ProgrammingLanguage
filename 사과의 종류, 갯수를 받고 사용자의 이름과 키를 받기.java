import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String apple, name;
        int count;
        float height;

        System.out.print("사과의 종류는? :");
        apple = keyboard.nextLine();
        System.out.print("사과의 갯수는? :");
        count = keyboard.nextInt();
        System.out.print("당신의 이름은? :");
        name = keyboard.nextLine();
        System.out.printf("%s님의 키는? :", name);
        height = keyboard.nextFloat();


        System.out.printf("사과의 종류는 %s 이고, 갯수는 %d개 입니다\n", apple, count);
        System.out.printf("%s님의 키는 %.1fcm 입니다\n", name, height);
    }
}
