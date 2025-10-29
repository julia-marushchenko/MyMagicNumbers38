 /**
 * Java program to find numbers dividable by 3.
 */

 package com.numbers;

import java.util.Random;

/**
 * com.numbers.Main class
 */
public class Main {

    // com.numbers.Main class to run java program
    public static void main(String[] args) {

        // Creating array with random integers
        int arr [] = new int[12];

        // Adding random numbers to the array
        for (int index = 0; index < arr.length; index++) {

            // Assigning a value to array with index of iteration
            arr[index] = new Random().nextInt();

        }

        // Iterating through the array and checking if number is dividable by 3
        for (int index = 0; index < arr.length; index++) {

            // Condition
            if (arr[index] % 3 != 0){

                // Printing the result to console
                System.out.println(arr[index] + " is not dividable by 3");

            } else {

                // Printing the result to console
                System.out.println(arr[index] + " is dividable by 3");

            }
        }
    }
}