package mtvelasquez;
import java.util.Scanner;
public class quintoejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual es el lado del cuadrado? ");
        double ladcuad = scanner.nextDouble();
        double arcuad = ladcuad * ladcuad;
        double percuad = 4 * ladcuad;
        System.out.println("Entonces el area del cuadrado es: " + arcuad);
        System.out.println("Entonces el perimetro del cuadrado: " + percuad);
        scanner.close();
}
}
