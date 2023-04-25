public class HomeWorkChar {
    public static void main(String[] args) {

        // 1
        char q = '0';
        int q1 = (int) q;
        System.out.println((int)q);

        // 2
        char d = '0';
        int d2 = Integer.parseInt(String.valueOf(d));
        System.out.println(d2);

        // 3
        char z = '0';
        int z3 = Character.getNumericValue(z);
        System.out.println(z3);

    }
}
