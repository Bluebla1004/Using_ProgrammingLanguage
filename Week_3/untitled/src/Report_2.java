import java.util.Scanner;

public class Report_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name, blood;
        int age;
        double weight;
        char genderKo, genderEn;

        System.out.print("이름: ");
        name = keyboard.nextLine();

        System.out.print("나이: ");
        age = keyboard.nextInt();

        System.out.print("몸무게(Kg): ");
        weight = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print("성별 (남/여): ");
        genderKo = keyboard.nextLine().charAt(0);
        if (genderKo == '남') {
            genderEn = 'M';
        } else if (genderKo == '여') {
            genderEn = 'W';
        } else {
            genderEn = 'E';
        }

        System.out.print("혈액형: ");
        blood = keyboard.nextLine();

        System.out.printf("%s은 %d살이고, %.2f Kg 입니다.\n", name, age, weight);
        System.out.printf("%s은 %s자(%s)입니다.\n", name, genderKo, genderEn);
        System.out.printf("혈액형은 %s 형 입니다.", blood);

    }
}