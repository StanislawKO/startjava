public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("муж.");
        wolf.setNickname("Волк");
        wolf.setWeight(53.5);
        wolf.setAge(30);
        wolf.setColor("серый");

        System.out.println("пол = " + wolf.getGender());
        System.out.println("кличка = " + wolf.getNickname());
        System.out.println("вес = " + wolf.getWeight());
        System.out.println("возраст = " + wolf.getAge());
        System.out.println("окрас = " + wolf.getColor());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
