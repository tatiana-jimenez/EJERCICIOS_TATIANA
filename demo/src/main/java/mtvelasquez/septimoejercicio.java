package mtvelasquez;
import java.util.Scanner;
public class septimoejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cual es el radio de la circunferencia?: ");
        double radcirc = scanner.nextDouble();
        double longcirc = 2 * Math.PI * radcirc;
        double arecirculo = Math.PI * Math.pow(radcirc, 2); 
        System.out.println("Entonces la longitud de la circunferencia es: " + longcirc);
        System.out.println("Entonces el area del circulo inscrito es: " + arecirculo);
        scanner.close();
    }
}
