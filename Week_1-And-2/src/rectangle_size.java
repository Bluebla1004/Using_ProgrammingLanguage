import java.util.Scanner;

public class rectangle_size {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int width, height, area, perimeter;

        System.out.print("사각형의 가로길이 입력:");
        width = keyboard.nextInt();
        System.out.print("사각형의 세로길이 입력:");
        height = keyboard.nextInt();

        area = width * height;
        perimeter = 2 * (width + height);

        System.out.printf("사각형의 가로길이: %d \u339D\n", width);
        System.out.printf("사각형의 세로길이: %d \u339D\n", height);
        System.out.printf("사각형의 면적: %d \u33A0\n", area);;
        System.out.printf("사각형의 둘레: %d \u339D\n", perimeter);

    }
}
