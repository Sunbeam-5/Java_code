public class 三和五的倍数 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }else {
                continue;
            }

        }
    }
}
