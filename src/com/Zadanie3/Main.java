package com.Zadanie3;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        while(true)
        {
            car.changeSpeed();
            car.changeStaringWheelRadius();
            car.changeEngineTemperature();

            Thread.sleep(1000 );

            Logger logger = Logger.getLogger("Car logs");
            logger.info("Speed: " + String.valueOf(car.getSpeed() +
                    " Steering Wheel Radius: " + car.getSteeringWheelRadius() +
                    " Engine Temperature: " + car.getEngineTemperature()));

        }
    }
}
