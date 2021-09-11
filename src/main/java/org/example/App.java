/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */
/*
How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "How many people? " );
        int people = scnN.nextInt();
        System.out.print( "How many pizzas do you have? " );
        int pizzas = scnN.nextInt();
        System.out.print( "How many slices per pizza? " );
        int slices = scnN.nextInt();
        System.out.println( people +" people with "+ pizzas + " pizzas ("+ (slices*pizzas) +" slices)" );
        System.out.println( "Each person gets "+ ((slices*pizzas)/people) + " pieces of pizza." );
        int leftover = (slices*pizzas)%people;
        System.out.print( "There are "+ leftover +" leftover pieces." );
    }
}
