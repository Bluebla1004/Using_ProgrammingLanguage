import java.text.DecimalFormat;

public class Report_3 {
    public static void main(String[] args) {
        DecimalFormat comma = new DecimalFormat("###,###");

        double distanceMoon = 384403;
        double LightSpeed = 300000;
        double LightSpeedMoon = distanceMoon / LightSpeed;

        String Moon = comma.format(distanceMoon);
        String Light = comma.format(LightSpeed);


        System.out.printf("달과의 거리: %s Km\n", Moon);
        System.out.printf("빛의 속도: %s km/s\n", Light);
        System.out.printf("달까지 빛의 속도로 가면 %.2f 초면 도착합니다.", LightSpeedMoon);
    }
}
