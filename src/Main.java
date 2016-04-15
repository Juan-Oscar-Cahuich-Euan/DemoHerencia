
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JUAN OSCAR PRO
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¡Elige la opción: *.* *_*!");
        System.out.println("[1] Bancaria [2] Ahorro [3] Cheques");
        int cuenta = leer.nextInt();
        System.out.println("--------------------------------------------------");
        if (cuenta == 1) {
            CuentaBancaria cuenta1 = new CuentaBancaria(100154325, "juan oscar");
            int contador = 0;
            System.out.println("NUMERO DE CUENTA: " + cuenta1.getnumeroDeCuenta() + " " + "NOMBRE: " + cuenta1.getcliente());
            while (contador == 0) {
                System.out.println(" ¿Que accion desea realizar?\n 1 = Depositar \n 2 = Retirar \n 3 = Finalizar \n");
                int a = leer.nextInt();
                if (a == 1) {
                    System.out.println("¿Cuanto deseas depositar?");
                    cuenta1.Depositar(leer.nextDouble());
                }
                if (a == 2) {
                    System.out.println("¿Cuanto deseas retirar?");
                    cuenta1.Retirar(leer.nextDouble());
                }
                if (a == 3) {
                    System.out.println("Fin");
                    contador = 1;
                }
                System.out.println("saldo: " + cuenta1.getSaldo());
            }
        }
        if (cuenta == 2) {
            CuentaDeAhorro cuenta2 = new CuentaDeAhorro(100154325, "juan oscar");
            System.out.println("NUMERO DE CUENTA: " + cuenta2.getnumeroDeCuenta() + " " + "NOMBRE: " + cuenta2.getcliente());
            System.out.println(cuenta2.getSaldo());
            cuenta2.Depositar(200);
            System.out.println(cuenta2.getSaldo());
            cuenta2.corteMensual();
            System.out.println(cuenta2.getSaldo());
            cuenta2.Retirar(500);
            System.out.println(cuenta2.getSaldo());
            cuenta2.corteMensual();
            System.out.println("saldo: " + cuenta2.getSaldo());
        }
        if (cuenta == 3) {
            CuentaDeCheques cuenta3 = new CuentaDeCheques(100154325, "juan oscar");
            System.out.println("NUMERO DE CUENTA: " + cuenta3.getnumeroDeCuenta() + " " + "NOMBRE: " + cuenta3.getcliente());
            int contador = 0;
             System.out.println(" ¡¡Tienes un saldo!!" + cuenta3.getSaldo());
            while (contador == 0) {
                System.out.println(" ¿Que accion desea realizar?\n 1 = Depositar \n 2 = Retirar \n 3 = Finalizar \n");
                int x = leer.nextInt();
             if (x == 1) {
                 System.out.println("¿Cuanto deseas depositar?");
                    cuenta3.Depositar(leer.nextDouble());
                }
                if (x == 2) {
                    System.out.println("saldo: " + cuenta3.getSaldo());
                    System.out.println("¿Cuanto deseas retirar?");
                    cuenta3.Retirar(leer.nextDouble());
                }
                if (x == 3) {
                    System.out.println("Fin");
                    contador = 1;
                }
                System.out.println("saldo: " + cuenta3.getSaldo());
            }
        }
    }
}

