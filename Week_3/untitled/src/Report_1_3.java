public class Report_1_3 {
    public static void main(String[] args) {
        String name = "홍 길동";
        String school = "경복대학교";
        int age = 20;
        String gender = "남(여)";
        double kidney = 170.6;
        double weight = 65.4;

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
