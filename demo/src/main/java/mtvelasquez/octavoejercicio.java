package mtvelasquez;
import java.util.Scanner;
public class octavoejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuales son los 3 numeros?: ");
        double prn = scanner.nextDouble();
        double sgn = scanner.nextDouble();
        double trn = scanner.nextDouble();
        double promt = (prn + sgn + trn) / 3;
        System.out.println("El promedio de la suma de los 3 numeros es: " + promt);
        scanner.close();
    }
}

