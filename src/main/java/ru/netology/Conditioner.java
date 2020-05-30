package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

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


    public void increaseCurrentTemperature() {   //вам не нужно в метод передавать значение
        if (currentTemperature == maxTemperature) {  //а просто работать с полем, которое в классе у вас уже определено
            return;                //если текущая температура уже достигла максимума, то вы ничего не делаете и "выходите" из метода
        }
        currentTemperature++;         //а если не максимальная, то прибавляете на единицу
    }

    public void decreaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature == minTemperature) {
           return;
        }
        currentTemperature--;
    }
}


