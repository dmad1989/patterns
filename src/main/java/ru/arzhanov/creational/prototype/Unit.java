package ru.arzhanov.creational.prototype;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor()
// @RequestScoped
public class Unit implements Copyble {
  @NonNull private Integer id;
  @NonNull private Integer healthPoints;
  @NonNull private Specialization specialization;

  @Override
  public Unit copy() {
    return new Unit(this.id, this.healthPoints, this.specialization);
  }
}
