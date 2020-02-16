public class MyFirstGame {
    public static void main(String[] args) {
        int number = 20;
        int tryOne = 5;
        int tryTwo = 30;
        int tryThree = 20;
        boolean result = true;

        while (result) {
            if (tryOne != number) {
                if (tryOne > number) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                } else {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                }
            } else {
                System.out.println("Вы угадали!");
            }

            if (tryTwo != number) {
                if (tryTwo > number) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                } else {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                }
            } else {
                System.out.println("Вы угадали!");
            }

            if (tryThree != number) {
                if (tryThree > number) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                } else {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                }
            } else {
                System.out.println("Вы угадали!");
                result = false;
            }
        }
    }
}
