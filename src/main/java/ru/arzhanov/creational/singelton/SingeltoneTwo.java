package ru.arzhanov.creational.singelton;

public class SingeltoneTwo {
    private SingeltoneTwo() {
        System.out.println("Singeltone creation!");
    }

    private static class SingeltoneHolder{
        public static final SingeltoneTwo INSTANCE = new SingeltoneTwo();
    }

    public static SingeltoneTwo getInstance() {
        return  SingeltoneHolder.INSTANCE;
    }
}
