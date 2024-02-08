package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double width;
        double length;
        double area;
        double perimiter;
        double min = 0;
        double max = 1000000;
        String lengthPrompt = "Enter length: ";
        String widthPrompt = "Enter width: ";
        String continuePrompt = "\n\ncontinue? (y/n): ";
        String[] allowedValue = {"y","Y","n","N"};
        //get input
        System.out.println("Welcome to the Area and Perimeter Calculator");

        String toContinue = "Y";
        while(toContinue.equalsIgnoreCase("Y")) {
            length = Console.getDouble(lengthPrompt , min, max);
            width = Console.getDouble(widthPrompt , min, max);
            //calculate the area and width
            area = width * length;
            perimiter = 2 * width + 2 * length;
            System.out.printf("Area: %f", area);
            System.out.printf("\nPerimeter: %,.2f", perimiter);

            // consume the new line character
            toContinue = Console.getString(continuePrompt,allowedValue);
            System.out.println();
        }
    }

}