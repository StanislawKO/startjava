public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int count = 6;
        while (count >= -6) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();

        int count2 = 10;
        do {
            System.out.print(count2 + " ");
            count2++;
        } while (count2 <= 20);
    }
}
