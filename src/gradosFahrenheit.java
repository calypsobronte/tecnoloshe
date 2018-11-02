import java.util.Scanner;

public class gradosFahrenheit {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados");
        double cent = leer.nextDouble();
        // fah = ((9*cen)/5)+32
        System.out.println("Los grados fahrenheit:" + (((9*cent)/5)+32));
    }
}
