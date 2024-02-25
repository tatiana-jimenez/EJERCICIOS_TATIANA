package mtvelasquez;
import java.util.Scanner;
public class sextoejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual es el radio del cilindro?: ");
        double radcilin = scanner.nextDouble();
        System.out.println("¿Cual es la altura del cilindro?: ");
        double altcilin = scanner.nextDouble();
        double areacilin = 2 * Math.PI * radcilin * (radcilin + altcilin);
        double volcilin = Math.PI * Math.pow(radcilin, 2) * altcilin;
        System.out.println("Entonces el area del cilindro es: " + areacilin);
        System.out.println("Entonces el volumen del cilindro es: " + volcilin);
        scanner.close();
    }
}
