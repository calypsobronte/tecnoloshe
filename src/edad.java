public class edad {
    public static void main(String[] args) {
        /*
        si (_) entonces
        sino
        finSi

        y &&
        o ||
        negacion !
        distinto !=
         */

        boolean tieneBoleta = false;
        short edad = 17;
        short edad1 = 18;

        //No entra porque no ingresa porque no se cumpel la condicion
        if (edad >= 18 && tieneBoleta ==true)
        {
            //No entra porque no ingresa porque no se cumpel la condicion
            System.out.println("bienvenido al bar");

        }else
            {//Vete de aqui
                System.out.println("Get out here!!");
            }

        //Entra porque se cumple las dos condiciones
        if (edad >= 18 || tieneBoleta)
        {
            //No entra porque no ingresa porque no se cumpel la condicion
            System.out.println("bienvenido al bar");

        }else
        {//Vete de aqui
            System.out.println("Get out here!!");
        }

        byte nivelAlcohol = 5; // 0 minimo ... 5 maximo
        //Entra no se cumple la condicion v y f = f
        if (edad1 >= 18 && (nivelAlcohol < 3 && tieneBoleta ==true))
        {
            //No entra porque no ingresa porque no se cumpel la condicion
            System.out.println("bienvenido al bar");

        }else
        {//Vete de aqui
            System.out.println("Get out here!!");
        }

        //Entra no se cumple la condicion v y f = f
        if (edad1 >= 18 && (nivelAlcohol < 3 || !tieneBoleta ==true))
        {
            //No entra porque no ingresa porque no se cumpel la condicion
            System.out.println("bienvenido al bar");

        }else
        {//Vete de aqui
            System.out.println("Get out here!!");
        }

        // otro
        if (edad1 > 18 )
        {
            //No entra porque no ingresa porque no se cumpel la condicion
            System.out.println("Eres mayor de edad");

        }else if (edad1 == 18)
        {//Vete de aqui
            System.out.println("tienes 18 anos");
        }else
            {
                System.out.println("No es mayor");
        }

    }
}
