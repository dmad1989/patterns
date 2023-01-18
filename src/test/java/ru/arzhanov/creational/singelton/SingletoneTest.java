package ru.arzhanov.creational.singelton;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class SingletoneTest {


    @Test
    void testSingletoneOne(){
        SingletoneOne s1 = SingletoneOne.getInstance();
        SingletoneOne s2 = SingletoneOne.getInstance();
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode() );
        s1.setField("This is set for first");
        assertEquals(s1.getField(), s2.getField());
    }

    // TODO another variants + tests
}