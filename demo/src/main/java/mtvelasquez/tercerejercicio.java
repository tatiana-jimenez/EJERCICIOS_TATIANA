package mtvelasquez;
import java.util.Scanner;
public class tercerejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero que quiera elevar al cuadrado: ");
        double numcuad = scanner.nextDouble();
        double rescuad = Math.pow(numcuad, 2);
        System.out.println("el numero " + numcuad + " al cuadrado da " + rescuad);
        scanner.close();
    }
}