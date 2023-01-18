package ru.arzhanov.creational.singelton;

public class SingletoneOne {

    private static SingletoneOne instance;

    public static SingletoneOne getInstance(){
        if (instance == null) {
            instance = new SingletoneOne();
        }
        return instance;
    }

    private SingletoneOne(){

    }
}
