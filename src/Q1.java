// Write a Java program to print 'Hello' on screen and your name on a separate line.

import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.nextLine();

        System.out.println( "Hello, \n" + name + "!");
    }
}