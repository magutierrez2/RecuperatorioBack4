public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(){
        titular = "";
        cantidad = 0.0;
    }
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    public String getTitular(){
        return titular;
    }
    public double getCantidad(){
        return cantidad;
    }

    public String mostrar(){
        return "Titular: " + this.titular + " cantidad: " + this.cantidad;
    }
    public void ingresar(double saldoIngresado){
        if(saldoIngresado > 0){
            cantidad = cantidad + saldoIngresado;
        }else {
            System.out.println("Debe ser mayor a 0");
        }
    }
    public void retirar(double saldoRetirar){
        if(saldoRetirar > 0 && saldoRetirar <= cantidad){
            cantidad = cantidad - saldoRetirar;
        } else if (saldoRetirar <= 0) {
            System.out.println("Fondo insuficientes");
        }
    }
}


