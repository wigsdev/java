import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el valor que pretende invertir este mes: ");
        double valor = scanner.nextDouble();

        System.out.println(nombre + " que tiene " + edad + " años, invertirá ARG " + valor + " este mes.");

        scanner.close();
    }
}
