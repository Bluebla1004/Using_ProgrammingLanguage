import java.util.Scanner;

public class Age_height_weight__receive {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        float weight, height;

        System.out.print("나이, 체중, 신장을 빈칸으로 분리하여 입력하세요: ");

        age = keyboard.nextInt();
        System.out.printf("당신의 나이는 %d살 입니다.%n", age);
        weight = keyboard.nextFloat();
        System.out.printf("당신의 체중은 %.1fkg 입니다.%n", weight);
        height = keyboard.nextFloat();
        System.out.printf("당신의 신장은 %.1fcm 입니다.%n", height);
    }
}
