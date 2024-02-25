package mtvelasquez;
import java.util.Scanner;
public class primerejercicio {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la base del triangulo: ");
            double batrian = scanner.nextDouble();
            System.out.println("Ingrese la altura del triangulo: ");
            double alturiangulo = scanner.nextDouble();
            double areatrian = (batrian * alturiangulo) / 2;
            System.out.println("El area del triangulo es: " + areatrian);
            scanner.close();
        }
    }
    
