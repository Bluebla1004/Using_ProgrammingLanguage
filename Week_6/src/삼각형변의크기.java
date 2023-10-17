import java.util.Scanner;

public class 삼각형변의크기 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int a, b, c;
        String result;
        double area;
        
        System.out.print("삼각형의 세변의 길이 입력: ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        
        if (a + b > c && b + c > a && a + c > b) {
            double s = (a + b + c) / 2.0;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            result = String.format("삼각형의 면적은 %.2f㎤", area);
        } else {
            result = "삼각형을 만들수가 없습니다.";
        }
        System.out.printf(result);
    }
}
