public class asd {
    public static void main(String[] args) {
        float mile;
        final float UNIT = 1609.344f;

        for (int meter = 1; meter <= 10; meter++) {
            mile = meter * UNIT;

            System.out.printf("%2d Meter는 %9.3f Mile 입니다.\n", meter++, mile);
        }
    }
}
