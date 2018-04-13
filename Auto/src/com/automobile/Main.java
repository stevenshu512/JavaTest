package com.automobile;

/**
 * Created by stevenshu on 2018/4/12.
 */
public class Main {
    public static void run(Auto auto){
        auto.accelerator();
        auto.brake();
        auto.field();
    }

    public static void main(String args[]){
        Auto volks = new Volkswagen(4,100,4);

        Auto jeep = new Jeep(6,200,8);
        run(jeep);
        run(volks);
    }
}
