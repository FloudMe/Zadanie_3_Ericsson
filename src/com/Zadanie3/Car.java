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

    public void changeSpeed()
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

    public void changeStaringWheelRadius()
    {
        Random random = new Random();

        int radius = ( (100 - speed) / 100 ) * random.nextInt(30) + 10;

        steeringWheelRadius = random.nextInt(60) + steeringWheelRadius - 30;
    }

    public void changeEngineTemperature()
    {
        Random random = new Random();

        int temperature = speed + 50 + ( random.nextInt(10) + 20 );

        engineTemperature = random.nextInt(speed) + temperature;
    }
}
