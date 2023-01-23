package ru.arzhanov.creational.singelton;

import lombok.Getter;
import lombok.Setter;

public class SingeltoneTwo implements ISingeltone {
  private SingeltoneTwo() {
    System.out.println("Singeltone creation!");
  }

  private static class SingeltoneHolder {
    public static final SingeltoneTwo INSTANCE = new SingeltoneTwo();
  }

  public static SingeltoneTwo getInstance() {
    return SingeltoneHolder.INSTANCE;
  }

  @Getter @Setter public String field;
}
