public class 거리재기 {
    public static void main(String[] args) {
        final int Minute = 60;
        final int Second = 60;
        final int Kilo = 1000;
        float Rabit = 60.0f * Kilo / (Minute / Second);
        float Turtle = 35.0f * Kilo / (Minute / Second);
        float rabitDistance = 0;
        float turtleDistence = 450.0f;

        int sec = 0;
        while (true) {
            rabitDistance += Rabit;
            turtleDistence += Turtle;

            if (rabitDistance > turtleDistence) {
                break;
            } else {
                System.out.printf("%d초 후에 거북이는 %.2fM이고, 토끼는 %.2fM이다\n", sec++, turtleDistence, rabitDistance);
            }
        }
        System.out.printf("%d초 후에 거북이는 %.2fM이고, 토끼는 %.2fM이다\n", sec, turtleDistence, rabitDistance);
    }
}
