package com.Zadanie3;

import java.util.Random;

public class Car {
    protected int speed = 0;
    protected int steeringWheelRadius = 0;
    protected int engineTemperature = 0;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSteeringWheelRadius() {
        return steeringWheelRadius;
    }

    public void setSteeringWheelRadius(int steeringWheelRadius) {
        this.steeringWheelRadius = steeringWheelRadius;
    }

    public int getEngineTemperature() {
        return engineTemperature;
    }

    public void setEngineTemperature(int engineTemperature) {
        this.engineTemperature = engineTemperature;
    }

    public void changeSpeed() //a function that randomly changes the speed field from 10 to 50
    {
        int maxSpeed = this.speed + 10, minSpeed = this.speed - 10;

        if(this.speed > 50) {
            maxSpeed = 50;
            minSpeed = 40;
        }
        else if(this.speed < 10) {
            minSpeed = 10;
            maxSpeed = 20;
        }

        Random random = new Random();

        this.speed = random.nextInt(maxSpeed - minSpeed) + minSpeed;
    }

    public void changeStaringWheelRadius() //a function which randomly provided the speed and her self fields changes the value of the steeringWheelRadius field
    {
        Random random = new Random();

        int radius = ( (100 - speed) / 100 ) * random.nextInt(30) + 10;

        this.steeringWheelRadius = random.nextInt(60) + this.steeringWheelRadius - 30;
    }

    public void changeEngineTemperature() // a function which randomly provided the speed field changes the value of the engineTemperature field
    {
        Random random = new Random();

        int temperature = this.speed + 50 + ( random.nextInt(10) + 20 );

        this.engineTemperature = random.nextInt(this.speed) + temperature;
    }
}
