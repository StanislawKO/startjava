public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "муж.";
        wolf.nickname = "Волк";
        wolf.weight = 53.5;
        wolf.age = 30;
        wolf.color = "серый";

        System.out.println("пол = " + wolf.gender);
        System.out.println("кличка = " + wolf.nickname);
        System.out.println("вес = " + wolf.weight);
        System.out.println("возраст = " + wolf.age);
        System.out.println("окрас = " + wolf.color);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
