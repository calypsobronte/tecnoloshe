import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sueldoEmpleado {

    public static void main(String[] args) throws IOException {
        // consultar la correcta nomenclatura clase metodos variables objetos en java
        //SonarQube
        //Expresiones regular cumplan con siertas caracteristicas. coincida.
        String nombre;
        System.out.println("Bienvenido a la Calculadora");

        System.out.println("Nombre del Empleado");
        BufferedReader empleado = new BufferedReader (new InputStreamReader(System.in));
        nombre = empleado.readLine();

        System.out.println("Indique el valor de una hora de trabajo");
        BufferedReader costoHora = new BufferedReader (new InputStreamReader(System.in));
        int valorHora = Integer.parseInt(costoHora.readLine());

        System.out.println("Indique cuantas horas laboro");
        BufferedReader numHoras = new BufferedReader (new InputStreamReader(System.in));
        int horasTrabajadas = Integer.parseInt(numHoras.readLine());

        System.out.println("El sueldo de: " + "$" + (horasTrabajadas*valorHora));
    }
}
