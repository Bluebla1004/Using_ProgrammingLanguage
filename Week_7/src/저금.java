public class 저금 {
    public static void main(String[] args) {
        int money = 0;
        int five = 500;
        int one = 100;
        int total = (five * 10) + (one * 10);
        int yers = 0;

        for (; yers!=30; yers++) {
            money = money + (total * 12);
        }
        System.out.printf("%d년간 저금한 금액은 %,d원 입니다", yers, money);
    }
}
