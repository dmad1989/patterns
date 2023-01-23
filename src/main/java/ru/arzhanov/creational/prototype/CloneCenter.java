package ru.arzhanov.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CloneCenter {
  Unit unit;

  public Unit cloneUnit() {
    return unit.copy();
  }

  public Unit cloneAndTrain(Specialization specialization) {
    Unit unit = this.unit.copy();
    unit.setSpecialization(specialization);
    unit.setHealthPoints(specialization.getHealthPoints());
    return unit;
  }
}
