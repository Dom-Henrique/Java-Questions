// Calcular área de um círculo

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Raio: ");
        float raio = scanner.nextFloat();

        // Verificador de área ou círculo

        System.out.println("O que deseja calcular?");
        System.out.println("1 - Área");
        System.out.println("2 - Comprimento da circunferência");
        int Decision = scanner.nextInt();

        if (Decision == 1) {
            System.out.println(3.14 * (raio * raio));
        } else if (Decision == 2) {
            System.out.println(2*3.14*raio);
        } else {
            System.out.println("ERRO");
        }
    }
}