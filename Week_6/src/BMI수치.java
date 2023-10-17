import java.util.Scanner;
/*
public class BMI수치 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char gender;
        float standard, ratio;
        int weight, height;
        String result, message = "필요없습니다";

        System.out.print("성별 (남자: 1, 여자: 2): ");
        gender = keyboard.next().charAt(0);
        System.out.print("키: ");
        height = keyboard.nextInt();
        System.out.print("몸무게: ");
        weight = keyboard.nextInt();

        if (gender == "1") {
            standard = (height - 100) * 0.9f;
        } else {
            standard = (height - 100) * 0.85f;
        }

        ratio = (weight - standard) / standard * 100.0f;
        if (ratio <= -10.0f){
            result = "저체중";
        } else if (ratio < 20.0f) {
            result = "정상";
        } else if (ratio < 29.0f) {
            result = "경도 비만";
        } else if (ratio < 49.0f) {
            result = "중도 비만";
        } else {
            result = "고도 비만";
        }

        if (result.equals("경도 비만") || result.equals("중도 비만") || result.equals("고도 비만")) {
            message = "필요합니다";
        }
        
        System.out.printf("키가 %d㎝인 %c자의 표준체형은 %.1f㎏ 입니다\n", height, gender == "1" ? "남" : "여", standard);
        System.out.printf("당신은 %s으로 표준체중보다 %.1f%% (%.1㎏) %s입니다\n", result, ratio, Math.abs(weight - standard), standard > weight ? "미달" : "초과");
        System.out.printf("당신은 다이어트가 %s\n", message);
    }
}
*/