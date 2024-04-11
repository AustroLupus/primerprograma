import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mensajeBienvenida = """
                ** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        int selected;
        int transaccion;
        int saldo = 1500;

        System.out.println("**************************");
        while (true){
            System.out.println(mensajeBienvenida);
            selected = entrada.nextInt();
            if (selected == 1){
                System.out.println("Su saldo es: " + saldo);
            } else if (selected == 2) {
                System.out.println("Rutina retira");
                System.out.println("Ingrese la cantidad a retirar");
                transaccion = entrada.nextInt();
                if (transaccion > saldo){
                    System.out.println("No hay fondos suficientes para su operacion");
                }else {
                    saldo -= transaccion;
                    System.out.println("Su nuevo saldo es: " + saldo);
                }
            } else if (selected == 3) {
                System.out.println("Rutina depositar");
                transaccion = entrada.nextInt();
                saldo += transaccion;
                System.out.println("Su nuevo saldo es: " + saldo);
            }else if (selected == 9) {
                break;
            }else {
                System.out.println("Opción incorrecta");
            }

        }
        System.out.println("Salio del programa");
    }
}
