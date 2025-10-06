// Soma de dois números

import java.util.Scanner; // Importa uma biblioteca

public class Q5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Cria uma instância

        System.out.println("First number: ");
        int n1 = scanner.nextInt();

        System.out.println("Second number: ");
        int n2 = scanner.nextInt();

        System.out.println(n1 + n2);
    }
}