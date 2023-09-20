import java.util.Scanner;

public class 사각형의크기구하기 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int garo, sero, area;
        char type = ' ';


        System.out.print("사각형의 가로길이(cm): ");
        garo = keyboard.nextInt();
        System.out.print("사각형의 세로길이(cm): ");
        sero = keyboard.nextInt();

        type = garo == sero ? '정' : '직';
        area = garo * sero;

        System.out.printf("**** %c사각형 넓이 ****\n", type);
        System.out.printf("\t가로 %d ㎝\n", garo);
        System.out.printf("\t가로 %d ㎝\n", sero);
        System.out.printf("\t먼적 %d ㎠\n", area);
    }
}
