git package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(20);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(20, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(-20);
        conditioner.setCurrentTemperature(-20);
        int expected = -20;
        conditioner.decreaseCurrentTemperature(expected);
    }
}