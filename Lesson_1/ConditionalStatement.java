public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        boolean man = true;
        double height = 1.70;
        char firstLetterName = 'M';

        if (age > 20) {
            System.out.println("Ваш возраст больше 20.");
        }

        if (man) {
            System.out.println("У Вас мужской пол.");
        }

        if (!man) {
            System.out.println("Не мужской пол.");
        }

        if (height < 1.80) {
            System.out.println("Ваш рост меньше 1,80.");
        } else {
            System.out.println("Ваш рост больше 1,80.");
        }

        if (firstLetterName == 'M') {
            System.out.println("Первая буква Вашего имени М.");
        } else if (firstLetterName == 'I'){
            System.out.println("Первая буква Вашего имени I.");
        } else {
            System.out.println("Ваше имя не начинается с букв М и I.");
        }

    }
}
