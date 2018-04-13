package com.automobile;

/**
 * Created by stevenshu on 2018/4/12.
 */
public class Jeep extends Auto {
    public Jeep(int wheel, int horsePower, int door) {
        super(wheel,horsePower,door);
    }


    @Override
    public void accelerator() {
        System.out.println("Jeep braking!");
    }

    @Override
    public void brake() {
        System.out.println("Jeep accelerating!");
    }

}
