package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void setCurrentTemperature() {             //установить температуру в позволенных рамках;
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(-15);
        conditioner.setCurrentTemperature(15);
        assertEquals(15, conditioner.getCurrentTemperature());
    }

    @Test
    void setCurrentTemperatureOverTheUpperBound() {   //установить температуру выше максимума;
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(-15);
        conditioner.setCurrentTemperature(30);
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    void setCurrentTemperatureBelowTheLowerBound() {    //установить температуру ниже минимума;
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(-15);
        conditioner.setCurrentTemperature(-20);
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
