import java.util.Scanner;

public class ingresoDatos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre = leer.nextLine();
        System.out.println("Su nombre es: "+ nombre);
        System.out.println("Ingrese la edad");
        short edad = leer.nextShort();
        System.out.println("Su edad es: "+edad);
    }
}
