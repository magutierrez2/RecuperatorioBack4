public class Cuenta {


    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;


    // (long) (1000000000 + Math.random() * 9000000000l)
    public Cuenta(String nombreDelTitular, double saldoDeCuenta) {
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = generarNumeroDeCuentaAleatorio();
    }
    public double setIngreso (double cantidad){
        if (cantidad > 0){
            saldoDeCuenta=saldoDeCuenta+cantidad;
            System.out.println("Se ha ingresado "+ cantidad);
        } else {
            System.out.println("La cantidad debe ser mayor a 0");

        }
        return saldoDeCuenta;
    }
    public double setRetiro (double cantidad){
        if (cantidad > 0 && cantidad<=saldoDeCuenta){
            saldoDeCuenta=saldoDeCuenta-cantidad;
            System.out.println("Se ha retirado "+ cantidad);
        } else if (cantidad<=0) {
            System.out.println("La cantidad a retirar debe ser mayor a 0");

        } else {
            System.out.println("saldo insuficiente");
        }
        return saldoDeCuenta;

    }
    public double getSaldoDeCuenta() {

        return saldoDeCuenta;
    }

    public String getDatosCuenta(){
        return "Titular de la Cuenta: "+ this.nombreDelTitular + " Saldo de la cuenta: "+ this.saldoDeCuenta + " Número de Cuenta: "+ this.numeroDeCuenta;
    }
    private long generarNumeroDeCuentaAleatorio() {

        return  (long)(Math.random()*9_000_000_000L)+ 1_000_000_000L;
    }
}


