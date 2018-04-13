package com.automobile;

/**
 * Created by stevenshu on 2018/4/12.
 */
public class Volkswagen extends Auto implements Run {
    public Volkswagen(int wheel, int horsePower, int door) {
        super(wheel,horsePower,door);
    }

    @Override
    public void accelerator() {
        System.out.println("Volkswagen accelerating!");
    }

    @Override
    public void brake() {
        System.out.println("Volkswagen braking!");
    }



}
