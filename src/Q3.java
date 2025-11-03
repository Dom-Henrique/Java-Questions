// Arithmetic operations

import java.util.Scanner;

public class Q3 {
    static void Arithmetic(float x, float y){
        float sum = x + y;
        float sub = x - y;
        float product = x * y;
        
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(product);
        if (x > y){
            float division = x / y;
            System.out.println(division);
        } else{
            System.out.print("Y = 0");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1st number: ");
        float n1 = scanner.nextFloat();
        System.out.print("2nd number: ");
        float n2 = scanner.nextFloat();

        Arithmetic(n1, n2);
    }
}