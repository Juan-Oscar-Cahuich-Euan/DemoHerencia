
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
        /**
         * CuentaBancaria cuenta1 = new CuentaBancaria(1, "juan oscar");
         * System.out.println("cuanto deas de positar: ");
         * cuenta1.depositar(leer.nextInt()); System.out.println("cuanto deas de
         * positar: "); cuenta1.depositar(leer.nextInt());
         * System.out.println("saldo:" + cuenta1.getSaldo());
         * System.out.println("cuento de retirar: ");
         * cuenta1.retirar(leer.nextInt()); System.out.println("saldo: " +
         * cuenta1.getSaldo() + " en " + cuenta1.getcliente());
         * System.out.println("Desea seguir retirando"); String s = leer.next();
         * if (s.equals("si")) { System.out.println("cuanto deas de positar: ");
         * cuenta1.depositar(leer.nextInt()); System.out.println("saldo:" +
         * cuenta1.getSaldo()); System.out.println("cuento de retirar: ");
         * cuenta1.retirar(leer.nextInt()); System.out.println("saldo:" +
         * cuenta1.getSaldo()); } else { System.out.println("Gracias regrese
         * pronto"); } }
         *
         * /**CuentaBancaria misAhorros = new CuentaBancaria(1, "juan oscar");
         * System.out.print("saldo: " + misAhorros.getsaldo());
         * misAhorros.depositar(1000.00); System.out.println("saldo: " +
         * misAhorros.getsaldo()); misAhorros.retirar(900.00);
         * System.out.println("saldo: " + misAhorros.getsaldo());
         * misAhorros.depositar(1000.00); System.out.println("saldo: " +
         * misAhorros.getsaldo()); misAhorros.retirar(900.00);
         * System.out.println("saldo: " + misAhorros.getsaldo());
         * misAhorros.depositar(1000.00); System.out.println("saldo: " +
         * misAhorros.getsaldo()); misAhorros.retirar(900.00);
         * System.out.println("saldo: " + misAhorros.getsaldo());
         */

        System.out.println("¿Que cuenta desea abrir?");
        System.out.println("[1] = Bancaria [2]= Ahorro");
        int cuenta = leer.nextInt();
        
        if (cuenta == 1) {
            CuentaBancaria cuenta1 = new CuentaBancaria(100154325, "juan oscar");
            int contador = 0;
            System.out.println(cuenta1.getnumeroDeCuenta() + " " + cuenta1.getcliente());
            while (contador == 0) {
                System.out.println("¿Que accion desea realizar?");
                System.out.println("1 = Depositar");
                System.out.println("2 = Retirar");
                System.out.println("3 = Finalizar");
                int accion = leer.nextInt();
                if (accion == 1) {

                    System.out.println("¿Cuanto dinero deseas depositar?");
                    double cantidad = leer.nextDouble();
                    cuenta1.Depositar(cantidad);
                }
                if (accion == 2) {
                    System.out.println("¿Cuanto dinero deseas retirar?");
                    double cantidad = leer.nextDouble();
                    cuenta1.Retirar(cantidad);
                }
                if (accion == 3) {
                    System.out.println("Fin");
                    contador = 1;
                }
                double saldo = cuenta1.getSaldo();
                System.out.println(+saldo);
            }
        }

        if (cuenta == 2) {
            CuentaDeAhorro cuenta2
                    = new CuentaDeAhorro(100154325, "juan oscar");
            System.out.println(cuenta2.getnumeroDeCuenta() + " " + cuenta2.getcliente());
            System.out.println(cuenta2.getSaldo());
            cuenta2.Depositar(200);
            System.out.println(cuenta2.getSaldo());
            cuenta2.corteMensual();
            System.out.println(cuenta2.getSaldo());
            cuenta2.Retirar(500);
            System.out.println(cuenta2.getSaldo());
            cuenta2.corteMensual();
            System.out.println(cuenta2.getSaldo());

        }
    }
}
