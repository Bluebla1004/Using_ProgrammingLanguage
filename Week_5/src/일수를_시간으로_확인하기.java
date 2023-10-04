public class 일수를_시간으로_확인하기 {
    public static void main(String[] args) {
        double day = 365.2421;

        int second = (int) (day * 24 * 60 * 60);
        int Minute = 60;
        int Hour = 60 * Minute;
        int Day = 24 * Hour;
        int days, hours, minutes;

        days = second / Day;
        second %= Day;

        hours = second / Hour;
        second %= Hour;

        minutes = second / Minute;
        second %= Minute;

        System.out.printf("%.4f = %d : %d : %d : %d ", day, days, hours, minutes, second);
    }
}
