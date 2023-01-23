package ru.arzhanov.creational.singelton;

import static org.junit.jupiter.api.Assertions.*;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
class SingletoneTest {

  @Test
  void testSingletoneOne() {
    SingletoneOne s1 = SingletoneOne.getInstance();
    SingletoneOne s2 = SingletoneOne.getInstance();
    abstractSingeltoneTest(s1, s2);
  }

  @Test
  void testSingeltoneTwo() {
    SingeltoneTwo st1 = SingeltoneTwo.getInstance();
    SingeltoneTwo st2 = SingeltoneTwo.getInstance();
    abstractSingeltoneTest(st1, st2);
  }

  void abstractSingeltoneTest(ISingeltone s1, ISingeltone s2) {
    assertEquals(s1, s2);
    assertEquals(s1.hashCode(), s2.hashCode());
    s1.setField("This is set for first");
    assertEquals(s1.getField(), s2.getField());
  }
}
