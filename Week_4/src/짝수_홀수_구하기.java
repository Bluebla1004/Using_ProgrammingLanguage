import java.util.Scanner;

public class 짝수_홀수_구하기 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int num;
        String result = "";

        System.out.print("양의 정수입력:");
        num = keyboard.nextInt();


        result = (num % 2 == 0) ? "짝" : "홀";

        System.out.printf("입력받은수는 %d는 %s수 입니다.", num, result);
    }
}
