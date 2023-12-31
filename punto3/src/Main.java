import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Cuenta> listCuenta = new ArrayList<>();
        System.out.println("Bienvenido a la aplicación de ingreso de cuentas");

        System.out.println("Ingrese nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese el saldo de la cuenta");
        double saldo = leer.nextDouble();
        //CREAMOS EL OBJETO CUENTA
        Cuenta objCuenta = new Cuenta(nombre, saldo);
        //Adicionamos a la lista ceunta
        listCuenta.add(objCuenta);
        menuRetiroDeposito(objCuenta, leer);
        System.out.println("El saldo en la cuenta es de " + listCuenta.get(0).getSaldoDeCuenta());
        System.out.println(listCuenta.get(0).getDatosCuenta());
    }
    private static void menuRetiroDeposito(Cuenta atrCuenta, Scanner leer) {

        int opcion;
        do {
            System.out.println("*******************************");
            System.out.println("* Seleccione una operación:   *");
            System.out.println("* 1. Realizar un retiro       *");
            System.out.println("* 2. Realizar un depósito     *");
            System.out.println("* 3. Salir                    *");
            System.out.println("*******************************");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese valor a retirar: ");
                    double retiro = leer.nextDouble();
                    atrCuenta.setRetiro(retiro);
                    break;

                case 2:
                    System.out.println("Ingrese el valor a depositar: ");
                    double deposito = leer.nextDouble();
                    atrCuenta.setIngreso(deposito);
                    break;
                case 3:
                    System.out.println("!!!!! Gracias por utilizar nuestro software !!!!!");
            }
        }while(opcion != 3);
    }
}