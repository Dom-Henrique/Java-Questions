// Tabuada com dois números dados pelo usuário
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number 1: ");
        int n1 = scanner.nextInt();

        System.out.println("Number 2: ");
        int n2 = scanner.nextInt();

        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);
        System.out.println(n1 % n2);
    }
}