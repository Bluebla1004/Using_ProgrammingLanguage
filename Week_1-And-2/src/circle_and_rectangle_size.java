import java.util.Scanner;

public class circle_and_rectangle_size {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius;
        double boxArea, circleArea, area;

        System.out.print("원의 반지름: ");
        radius = scanner.nextInt();

        //Math.pow = 제곱
        //정사각형
        boxArea = Math.pow(2 * radius, 2);

        //Math.PI 원의 원주를 지름으로 나눈비율(원주율)값
        //원
        circleArea = Math.PI * Math.pow(radius, 2);

        //면적
        area = boxArea - circleArea;

        //구하는 면적 계산
        area = boxArea - circleArea;
        System.out.printf("정사각형 면적: %s ㎠%n", boxArea);
        System.out.printf("원의 면적: %s ㎠%n", circleArea);
        System.out.printf("구하는 면적: %s ㎠%n", area);
    }
}
