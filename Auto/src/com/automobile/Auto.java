package com.automobile;

/**
 * Created by stevenshu on 2018/4/12.
 */
public class Auto implements Run {
    private int wheel;
    private int horsePower;
    private int door;

    public Auto(int wheel, int horsePower, int door) {
        this.wheel = wheel;
        this.horsePower = horsePower;
        this.door = door;
    }

    public Auto() {
    }

    @Override
    public void accelerator() {

    }

    @Override
    public void brake() {

    }

    public void turnLeft(){

    }

    public void turnRight(){

    }
    public void field(){
        System.out.println("the door is "+ this.getDoor());
        System.out.println("the wheel is "+ this.getWheel());
        System.out.println("the horsePower is "+ this.getHorsePower());
    }


    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }
}
