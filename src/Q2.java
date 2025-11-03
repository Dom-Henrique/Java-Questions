// Write a Java program to print the sum of two numbers.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1st number: ");
        float n1 = scanner.nextFloat();
        System.out.print("2nd number: ");
        float n2 = scanner.nextFloat();

        System.out.println(n1 + n2);
    }  
}