// Área de figuras geométricas
import java.util.Scanner;

public class Q5 {
    static void Circle(float radius){
        var area = 3.14 * (Math.pow(radius, 2));
        var length = 2 * 3.14 * radius;
        System.out.print("Circle area: " + area + "\nCircle perimeter: " + length);
    }

    static void Triangle(float base, float height, float l2, float l3){
        var area = (base * height)/2;
        var perimeter = base + l2 + l3;
        System.out.print("Triangle area: " + area + "\nTriangle perimeter: " + perimeter);
    }

    static void Quadrilateral(float base, float height){
        var area = base * height;
        var perimeter = base*2 + height*2;
        System.out.print("Quadrilateral area: " + area + "\nQuadrilateral perimeter: " + perimeter);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Figure: ");
        var option = scanner.nextLine();
        option.toLowerCase();

        if (option == "circle"){
            System.out.print("Radius: ");
            float radius = scanner.nextFloat();

            Circle(radius);
        } else if (option == "triangle") {
            System.out.print("Base: ");
            float base_tr = scanner.nextFloat();
            System.out.print("Height: ");
            float height_tr = scanner.nextFloat();
            System.out.print("L2: ");
            float l2 = scanner.nextFloat();
            System.out.print("L3: ");
            float l3 = scanner.nextFloat();

            Triangle(base_tr, height_tr, l2, l3);
        } else if (option == "quadrilateral"){
            System.out.print("Base: ");
            float base = scanner.nextFloat();
            System.out.print("Height: ");
            float height = scanner.nextFloat();

            Quadrilateral(base, height);
        } else{
            System.out.println("Invalid option");
        }
    }
}
