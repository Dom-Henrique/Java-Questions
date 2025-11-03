// Tabuada

import java.util.Scanner;

public class Q4 {
    static void Tabuada(int x){
        for (int i = 1; i <= 10; i++){
            System.out.println(i + " x " + x + " = " + x*i);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int n1 = scanner.nextInt();
        Tabuada(n1);
    }
}
