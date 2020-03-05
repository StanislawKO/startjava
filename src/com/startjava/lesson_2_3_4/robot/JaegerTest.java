package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
//        Jaeger gipsyDanger = new Jaeger();
//        gipsyDanger.setModelName("Gipsy Danger");
//        gipsyDanger.setMark("Mark-3");
//        gipsyDanger.setOrigin("USA");
//        gipsyDanger.setHeight(79.25f);
//        gipsyDanger.setWeight(1.98f);
//        gipsyDanger.setSpeed(7);
//        gipsyDanger.setStrength(8);
//        gipsyDanger.setArmor(6);

        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.98f, 7, 8, 6);
        System.out.println(gipsyDanger.getModelName());
        System.out.println(gipsyDanger.getMark());
        System.out.println(gipsyDanger.getOrigin());
        System.out.println(gipsyDanger.getHeight());
        System.out.println(gipsyDanger.getWeight());
        System.out.println(gipsyDanger.getSpeed());
        System.out.println(gipsyDanger.getStrength());
        System.out.println(gipsyDanger.getArmor());

        gipsyDanger.drift();
        gipsyDanger.move();
        gipsyDanger.scanKaiju();
        gipsyDanger.useVortexCannon();

//        Jaeger chernoAlpha = new Jaeger();
//        chernoAlpha.setModelName("Cherno Alpha");
//        chernoAlpha.setMark("Mark-1");
//        chernoAlpha.setOrigin("Russia");
//        chernoAlpha.setHeight(85.34f);
//        chernoAlpha.setWeight(2.412f);
//        chernoAlpha.setSpeed(3);
//        chernoAlpha.setStrength(10);
//        chernoAlpha.setArmor(10);

        Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2.412f, 3, 10, 10);
        System.out.println(chernoAlpha.getModelName());
        System.out.println(chernoAlpha.getMark());
        System.out.println(chernoAlpha.getOrigin());
        System.out.println(chernoAlpha.getHeight());
        System.out.println(chernoAlpha.getWeight());
        System.out.println(chernoAlpha.getSpeed());
        System.out.println(chernoAlpha.getStrength());
        System.out.println(chernoAlpha.getArmor());

        chernoAlpha.drift();
        chernoAlpha.move();
        chernoAlpha.scanKaiju();
        chernoAlpha.useVortexCannon();

    }
}
