public class 닭과개마릿수확인 {
    public static void main(String[] args) {
        int chekin = 0;
        int dog = 37;
        int leg = 4 * dog;

        for (; leg != 102; leg -= 2) {
            dog--;
            chekin++;
        }
        System.out.println("====[ For ]==========");
        System.out.printf("닭 [%d마리]\n개 [%d마리]\n\n", chekin, dog);

//=================================================================//

        dog = 37;
        chekin = 0;
        leg = 4 * dog;
        while (leg != 102) {
            dog--;
            chekin++;
            leg -= 2;
        }
        System.out.println("====[ while ]========");
        System.out.printf("닭 [%d마리]\n개 [%d마리]\n\n", chekin, dog);

//=================================================================//

        dog = 37;
        chekin = 0;
        leg = 4 * dog;
        do {
            dog--;
            chekin++;
            leg -= 2;
        } while (leg != 102);

        System.out.println("====[ do while ]=====");
        System.out.printf("닭 [%d마리]\n개 [%d마리]\n", chekin, dog);
        System.out.println("=====================");
    }
}
