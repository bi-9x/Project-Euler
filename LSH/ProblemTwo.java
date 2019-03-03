class Algogo {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int sum = 0;
        while (true) {
            int c = a + b;
            if (c > 4000000) {
                break;
            }
            if (c % 2 == 0) {
                sum = sum + c;
            }
            a = b;
            b = c;

        }
        System.out.println(sum + 2);
    }
}