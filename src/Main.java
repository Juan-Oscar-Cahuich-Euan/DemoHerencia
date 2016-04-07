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
        CuentaBancaria misAhorros = new CuentaBancaria(1, "juan oscar");
        System.out.print("saldo: " + misAhorros.getsaldo());
        misAhorros.depositar(1000.00);
        System.out.println("saldo: " + misAhorros.getsaldo());
        misAhorros.retirar(900.00);
        System.out.println("saldo: " + misAhorros.getsaldo());
        misAhorros.depositar(1000.00);
        System.out.println("saldo: " + misAhorros.getsaldo());
        misAhorros.retirar(900.00);
        System.out.println("saldo: " + misAhorros.getsaldo());
        misAhorros.depositar(1000.00);
        System.out.println("saldo: " + misAhorros.getsaldo());
        misAhorros.retirar(900.00);
        System.out.println("saldo: " + misAhorros.getsaldo());
    }

}
