package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("How many days' temperatures? ");
        int numDays = scanner.nextInt();
        int[] temps = new int[numDays];
        int sum = 0;
        for(int i = 0; i < numDays; i++){
            System.out.println("Day " + i+1 + "'s high temp: ");
            temps[i] = scanner.nextInt();
            sum += temps[i];
        }
        double averageTemperature = sum / numDays;
        System.out.println("The average temperature is " + averageTemperature);
        //counting days above average temperature
        int above = 0;
        for (int i=0; i<temps.length; i++){
            if (temps[i] > averageTemperature){
                above ++;
            }
        }
        System.out.println("Number of days above average temperature is " + above);

    }
}
