package com.Zadanie3;

import java.util.logging.Logger;

/*
The program works in the following way, an instance of the Car class is created, in which the speed, steeringWheelRadius and engineTemperature fields are initialized.
The class has getters and setters. Moreover, the class has methods to change the value of fields randomly. 
In main, there is a loop that calls methods from the Car class to randomly change values, and to log these values ​​every 1000ms, i.e. 1 s
*/

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        while(true)
        {
            car.changeSpeed();
            car.changeStaringWheelRadius();
            car.changeEngineTemperature();

            Thread.sleep(1000);

            Logger logger = Logger.getLogger("Car logs");
            logger.info("Speed: " + String.valueOf(car.getSpeed() +
                    " Steering Wheel Radius: " + car.getSteeringWheelRadius() +
                    " Engine Temperature: " + car.getEngineTemperature()));

        }
    }
}
