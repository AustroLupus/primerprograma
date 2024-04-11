import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(100);
        System.out.println(numeroSecreto);
        Scanner teclado = new Scanner(System.in);
        int contadorIntentos = 0;

        while (contadorIntentos < 5) {
            System.out.println("Ingrese el número secreto");
            int numeroUsuario = teclado.nextInt();
            if (numeroSecreto == numeroUsuario) {
                System.out.println("Adivinaste el número secreto");
                break;
            } else if (numeroSecreto>numeroUsuario) {
                System.out.println("Intenta un número más alto");
            }else {
                System.out.println("Intenta un número más bajo");
            }
            contadorIntentos++;
        }
        System.out.println("Se acabaron los intentos");
    }
}
