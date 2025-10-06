// Tabuada de multiplicação
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        int cont = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number: ");
        float n1 = scanner.nextFloat();

        System.out.println("Tabuada do " + n1);
        while(cont <= 10){
            System.out.println(n1 * cont);
            cont++;
        }
    }
}