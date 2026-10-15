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


    }
}