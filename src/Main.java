import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        double precio;

        System.out.println("Ingrese el precio del articulo");
        precio = scaner.nextInt();

        double precioIva = precio*1.21;

        System.out.println("El precio del articulo con iva es de: " + precioIva);
    }
}