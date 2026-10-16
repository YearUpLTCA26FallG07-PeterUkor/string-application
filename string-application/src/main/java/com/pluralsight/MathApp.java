package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        double bobSalary = 20000;
        double garySalary = 30000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        double carPrice = 25000;
        double truckPrice = 45000;
        double cheaperVehicle = Math.min(carPrice, truckPrice);
        System.out.println("The cheaper vehicle is " + cheaperVehicle);

        double radius = 7.25;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + circleArea);

        double square = 5.0;
        double squareRoot = Math.sqrt(square);
        System.out.println("The square root of " + square + " is " + squareRoot);

        double pointX1 = 5;
        double pointY1 = 10;
        double pointX2 = 85;
        double pointY2 = 50;
        double pointX = pointX2 - pointX1;
        double pointY = pointY2 - pointY1;
        double distance = Math.sqrt(Math.pow(pointX, 2) + Math.pow(pointY, 2));
        System.out.println("The distance is " + distance);

        double preAbsoluteValue = -3.8;
        double absoluteValue = Math.abs(preAbsoluteValue);
        System.out.println("The absolute value is " + absoluteValue);

        double randomNumber = Math.random();
        System.out.println("A random number is " + randomNumber);

        int millisecondsInASecond = 1000;
        int secondsInAMinute = 60;
        int minutesInAnHour = 60;
        int hoursInADay = 24;
        int days = 24;
        int totalMinutes = minutesInAnHour * hoursInADay * days;
        long totalMillisecondsInAMinute = (long) millisecondsInASecond * secondsInAMinute * totalMinutes;
        System.out.println("There are " + totalMinutes + " minutes in " + days + " days");
        System.out.println("There are " + totalMillisecondsInAMinute + " milliseconds in " + days + " days");

    }
}
