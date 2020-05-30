package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void setCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(-12);
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(-100);
        assertEquals(0, conditioner.getCurrentTemperature());
    }


    @Test
    void increaseCurrentTemperature() {          //вызов метода должен повышать t на 1;
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(20);
        conditioner.increaseCurrentTemperature();
        assertEquals(1, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {           //вызов метода должен понижать t на 1;
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(-20);
        conditioner.decreaseCurrentTemperature();
        assertEquals(-1, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperatureUpperBound() {    //попытка выйти за границей верхнего значения;
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(20);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        assertEquals(20, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperatureLowerBound() {     //попытка выйти за границы нижнего значения;
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(-20);
        conditioner.setCurrentTemperature(-20);
        conditioner.decreaseCurrentTemperature();
        assertEquals(-20, conditioner.getCurrentTemperature());
    }
}
