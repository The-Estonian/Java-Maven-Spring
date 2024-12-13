package com.numbers;

public class Centripetal {

    private static double calcPathVelocity(double radius, double period) {
        return (double) 2 * Math.PI * radius / period;
    }

    private static double calcCentripetalAccel(double pathVel, double radius) {
        return Math.pow(pathVel, 2) / radius;
    }

    private static double calcCentripetalForce(double mass, double acc) {
        return mass * acc;
    }

    public static double centripedal(double radius, double period, double mass) {
        return calcCentripetalForce(mass, calcCentripetalAccel(calcPathVelocity(radius, period), radius));
    }

    public static void main(String[] args) {
        System.out.println(calcPathVelocity(0.8, 3));
        System.out.println(calcCentripetalAccel(1.67, 0.8));
        System.out.println(calcCentripetalForce(.2, 3.504));
        System.out.println(centripedal(.8, 3, 0.2));
    }

}
