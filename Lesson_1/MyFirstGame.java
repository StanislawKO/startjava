public class MyFirstGame {
    public static void main(String[] args) {
        int number = 20;
        int guess = 10;

        while (true) {
            if (guess != number) {
                if (guess > number) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                    guess--;
                } else {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                    guess++;
                }
            } else {
                break;
            }
        }
        System.out.println("Вы угадали!");
    }
}
