package ru.arzhanov.creational.singelton;

import lombok.Getter;
import lombok.Setter;

public class SingletoneOne {

    private static SingletoneOne instance;

    public static SingletoneOne getInstance(){
        if (instance == null) {
            instance = new SingletoneOne();
        }
        return instance;
    }

    @Getter
    @Setter
    public String field;

    private SingletoneOne(){

    }
}
