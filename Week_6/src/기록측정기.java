import java.util.Scanner;

public class 기록측정기 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        float record;
        String result;

        System.out.print("당신의 100m 기록 입력: ");
        record = keyboard.nextFloat();
        /*
        if (record < 10.0f) {
            result = "육상선수 후보";
        } else if (record < 11.0f) {
            result = "축구선수 후보";
        } else if (record < 12.0f) {
            result = "하키선수 후보";
        } else {
            result = "운동선수 부적합";
        }
         */

        switch ((int) record){
            case 9:
                result = "육상선수 후보";
                break;
            case 10:
                result = "축구선수 후보";
                break;
            case 11:
                result = "하키선수 후보";
                break;
            default:
                result = "운동선수 부적합";
        }
        System.out.printf("당신의 100m 기록은 %.2f초 이며, %s 입니다.", record, result);
    }
}
