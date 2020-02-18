public class ConditionalStatement {
    public static void main(String[] args) {
		int age = 30;
        if (age > 20) {
            System.out.println("Ваш возраст больше 20.");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("У Вас мужской пол.");
        }

        if (!isMale) {
            System.out.println("Не мужской пол.");
        }

        double height = 1.70;
        if (height < 1.80) {
            System.out.println("Ваш рост меньше 1,80.");
        } else {
            System.out.println("Ваш рост больше 1,80.");
        }

        char firstLetterName = 'M';
        if (firstLetterName == 'M') {
            System.out.println("Первая буква Вашего имени М.");
        } else if (firstLetterName == 'I'){
            System.out.println("Первая буква Вашего имени I.");
        } else {
            System.out.println("Ваше имя не начинается с букв М и I.");
        }
    }
}
