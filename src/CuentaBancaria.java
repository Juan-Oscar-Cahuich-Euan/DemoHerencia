
public class CuentaBancaria {

    private int numeroDeCuenta;
    private String cliente;
    private double saldo;
    
    public CuentaBancaria(int numeroDeCuenta, String cliente) {
    this.numeroDeCuenta = numeroDeCuenta;
    this.cliente = cliente;
    this.saldo = 0.0;
}
   public double getsaldo() {
       return saldo;
   } 
   public boolean depositar (double cantidad) {
       boolean seRealizoDeposito;
       if (cantidad > 0.0) {
           saldo = saldo + cantidad;
           seRealizoDeposito =  true;
       }
       else {
           seRealizoDeposito = false;
       }
       return seRealizoDeposito;
   }
   public boolean retirar (double cantidad) {
       boolean seRealizoRetiro;
       if (cantidad <= getsaldo()) {
           saldo = saldo - cantidad;
           seRealizoRetiro = true;
       }
       else { 
           seRealizoRetiro = false;
       }
       return seRealizoRetiro;
   }
}
