package mtvelasquez;
import java.util.Scanner;
public class cuartoejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double difvalor = 1.08;
        System.out.println("Escriba cuantos euros quiere pasar a dolares:");
        double euros = scanner.nextDouble();
        double dolares = euros * difvalor;
        System.out.println(euros + " euros equivalen a " + dolares + " dolares.");
        scanner.close();
    }
}