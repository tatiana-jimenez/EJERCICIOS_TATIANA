package mtvelasquez;
import java.util.Scanner;
public class segundoejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el primer numero que quiere sumar: ");
        double primnum = scanner.nextDouble();
        System.out.println("Escriba el segundo numero que quiere sumar: ");
        double segdonum = scanner.nextDouble();
        double resusuma = primnum + segdonum;
        System.out.println("La sumatoria de estos 2 numeros es: " + resusuma);
        scanner.close();
    }
}
