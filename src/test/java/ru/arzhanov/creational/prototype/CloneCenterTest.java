package ru.arzhanov.creational.prototype;

import static org.junit.jupiter.api.Assertions.*;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
class CloneCenterTest {

  @Test
  void testCloneSimilar() {
    Unit peasant = new Unit(1, Specialization.PEASANT.getHealthPoints(), Specialization.PEASANT);
    CloneCenter cloneCenter = new CloneCenter(peasant);
    Unit clone = cloneCenter.cloneUnit();
    assertEquals(peasant.getId(), clone.getId());
    assertEquals(peasant.getHealthPoints(), clone.getHealthPoints());
    assertEquals(peasant.getSpecialization(), clone.getSpecialization());
    assertNotEquals(peasant.hashCode(), clone.hashCode());
  }

  @Test
  void testCloneWithChanges() {
    Unit peasant = new Unit(1, Specialization.PEASANT.getHealthPoints(), Specialization.PEASANT);
    CloneCenter cloneCenter = new CloneCenter(peasant);
    Unit clone = cloneCenter.cloneAndTrain(Specialization.WARRIOR);
    assertEquals(peasant.getId(), clone.getId());
    assertNotEquals(peasant.getHealthPoints(), clone.getHealthPoints());
    assertEquals(clone.getHealthPoints(), Specialization.WARRIOR.getHealthPoints());
    assertNotEquals(peasant.getSpecialization(), clone.getSpecialization());
    assertEquals(clone.getSpecialization(), Specialization.WARRIOR);
    assertNotEquals(peasant.hashCode(), clone.hashCode());
  }
}
