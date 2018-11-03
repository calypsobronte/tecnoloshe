public class conversiones {
    public static void main(String[] args) {
        byte b = 6;
        short s = b;

        b = (byte) s;

        int i = 1;
        double d = 2.8;
        i= (int) d;

        int codigo = 97;
        char codigoASCII = (char) codigo;

        System.out.println(codigoASCII);

        short numero = 300;
        byte numeroByte = (byte) numero;

        System.out.println(numeroByte);
    }
}
