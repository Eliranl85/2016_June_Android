package com.company;

/**
 * Created by eladlavi on 31/07/2016.
 */
public class Poodle extends Dog {

    String name;

    @Override
    public void goToSleep() {
        System.out.println("poodle is going to sleep " + name);
    }
}
