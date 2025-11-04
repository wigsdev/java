import java.util.Scanner;

public class DesafioJuegoDeAdivinacion {
    public static void main(String[] args) {
        //Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio entre 0 y 100, y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos. En cada intento, el programa debe informar si el número ingresado por el usuario es mayor o menor que el número generado.
        //Consejos:
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new java.util.Random().nextInt(101); // Genera un número entre 0 y 100
        int intentos = 0;
        int numeroUsuario;
        final int MAX_INTENTOS = 5;

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("He generado un número entre 0 y 100. Tienes " + MAX_INTENTOS + " intentos para adivinarlo.");

        while (intentos < MAX_INTENTOS) {
            System.out.print("Intento #" + (intentos + 1) + ": Ingresa tu número: ");
            numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! ¡Adivinaste el número " + numeroAleatorio + " en " + intentos + " intentos!");
                break;
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número que ingresaste es MENOR que el número secreto.");
            } else {
                System.out.println("El número que ingresaste es MAYOR que el número secreto.");
            }

            if (intentos == MAX_INTENTOS) {
                System.out.println("¡Se acabaron tus intentos! El número secreto era: " + numeroAleatorio);
            }
        }
        scanner.close();
    }
}
