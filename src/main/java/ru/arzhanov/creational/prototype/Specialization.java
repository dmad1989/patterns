package ru.arzhanov.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Specialization {
  PEASANT(50),
  WARRIOR(150),
  TRADER(70),
  WIZARD(100);

  @Getter final Integer healthPoints;
}
