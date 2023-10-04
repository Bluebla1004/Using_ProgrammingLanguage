import java.util.Scanner;

public class 홀수짝수구분 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int num;
        String result = "";

        System.out.print("정수 입력: ");
        num = keyboard.nextInt();
        /*
        switch (num % 2){
            case 0:
                result = "짝";
                break;
            default:
                result = "홀";
        }
        */
        /*
        if ((num % 2) == 0) {
            result = "짝";
        } else {
            result = "홀";
        }

         */
        result = (num % 2 == 0) ? "짝" : "홀";

        System.out.printf("입력받은 %d는 %s수 입니다 \n", num, result);

    }
}
