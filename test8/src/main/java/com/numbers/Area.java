package com.numbers;

public class Area {
    /**
     * This method calcualtes the area of circle
     * @param radius
     * @return
     */
    public static double calcAreaOfCircle(double radius) {
        return Math.PI * (radius * radius);
        // return Math.PI * Math.pow(radius, 2);
    }
}
