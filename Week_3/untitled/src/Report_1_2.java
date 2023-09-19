public class Report_1_2 {
    public static void main(String[] args) {
        final String name = "홍 길동";
        final String school = "경복대학교";
        final int age = 20;
        final String gender = "남(여)";
        final double kidney = 170.6;
        final double weight = 65.4;

        System.out.println("*********************");
        System.out.printf("학교 : %s\n", school);
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("성별 : %s\n", gender);
        System.out.printf("신장 : %.1f Cm\n", kidney);
        System.out.printf("체중 : %.1f Kg\n", weight);
        System.out.println("*********************");
    }
}
