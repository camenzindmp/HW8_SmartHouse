package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;
    private int temperatureStep = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature + temperatureStep <= maxTemperature) {
            currentTemperature = this.currentTemperature + temperatureStep;
        }
        this.currentTemperature = currentTemperature;
    }


    public void decreaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature - temperatureStep >= minTemperature) {
            currentTemperature = this.currentTemperature - temperatureStep;
        }
        this.currentTemperature = currentTemperature;
    }
}


