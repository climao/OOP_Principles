package classVariables;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import classVariables.Bicycle;
import org.junit.jupiter.api.Test;

class BicycleTest {

    Bicycle bicycle;

    @BeforeEach
    void setUp() {
        this.bicycle = new Bicycle(1, 1, 1);
    }


    @Test
    void test_getCadence() {
        assertEquals(this.bicycle.getCadence(), 1);
    }
}