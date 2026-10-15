package com.pluralsight;
public class MathApp {
    public static void main(String[] args) {
// Question 1:
// declare variables here
// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE
        // Question 1
        double bobSalary = 55000.00;
        double garySalary = 84000.00;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);
        // Question 2
        double carPrice = 12000.22;
        double truckPrice = 50000.55;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is " + smallestPrice);
        // Question 3
        double radius = 7.25;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("A circle that has a radius of " + radius + " has the area of " + circleArea);
        // Question 4
        double number = 5.0;
        double root = Math.sqrt(number);
        System.out.println("A variable that is set to " + number + " has the square root of " + root);
        // Question 5
        double x0 = 5, y0 = 10;
        double x1 = 85, y1 = 50;
        double distance = Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));
        System.out.println("The distance between (5, 10) and (85, 50) is " + distance);
        // Question 6
        double negativeNum = -3.8;
        double absoluteValue = Math.abs(negativeNum);
        System.out.println("The absolute value of " + negativeNum + " is " + absoluteValue);
        // Question 7
        double randNum = Math.random();
        System.out.println("A random number between 0 and 1 is " + randNum);




    }
}