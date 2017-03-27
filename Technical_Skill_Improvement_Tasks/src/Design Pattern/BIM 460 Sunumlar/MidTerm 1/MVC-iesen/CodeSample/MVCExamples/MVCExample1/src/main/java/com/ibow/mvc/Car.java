package com.ibow.mvc;

/**
 * Created by IntelliJ IDEA.
 * User: ibow
 * Date: 19.Þub.2010
 * Time: 20:47:46
 */
public class Car {

    private int speed;
    private String name;


    public Car(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
