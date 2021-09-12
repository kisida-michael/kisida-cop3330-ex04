package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */
import java.util.Scanner;
public class App
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter a noun: ");
        String noun  = input.nextLine();  // Read user input
        System.out.print("Enter a verb: ");
        String verb  = input.nextLine();  // Read user input
        System.out.print("Enter a adjective: ");
        String adjective  = input.nextLine();  // Read user input
        System.out.print("Enter a adverb: ");
        String adverb  = input.nextLine();  // Read user input

        String output = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb );
        System.out.println(output);
        input.close();
    }
}
