import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el la base");
        int base1 = leer.nextInt();
        System.out.println("Ingrese el la altura");
        int altura1 = leer.nextInt();
        //area=(base*altura)/2
        System.out.println("El area del triangulo es:" + ((base1*altura1)/2));

    }
}
