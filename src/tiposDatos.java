public class tiposDatos
{
    public static void main(String[] args) {

        // Tipos de datos enteros
        byte edad = 26; // Byte --> -128 a 127
        short year = 2018; // Short --> -32768 a 32767
        int id_User = 1001; // Int --> 2147483648 a 2147483647
        long id_Twitter = 138434834738743L; // Long --> -9223372036854775808 a	9223372036854775807

        //Punto flotante
        float diametro = 34.25F;
        double precio = 12345.2323423523;

        //Texto 2 bytes
        char genero = 'F';

        //Logico - > boolean 2 bytes
        boolean isVisible = true;
        boolean funciona = false;

        byte tipoByte = 0;
        short tipoShort =0;
        int tipoInt = 0;
        char tipoChart;
        long tipoLong = 2140000001;
        float tipoFloat = 0.0f;
        double tipoDouble = 0.0;
        boolean tipoBoolean = false;

        tipoByte = 127;
        tipoShort = 1247;

        short tipoShortDos = tipoByte;
        System.out.println("Cuando tipo de "+ tipoShortDos);

        byte tipoByteDos = (byte) tipoShort;


    }
}
