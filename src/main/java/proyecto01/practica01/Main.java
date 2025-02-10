
package proyecto01.practica01;

public class Main {
    public static void main(String[] args) {
        //ingreso
        Transaccion ingreso = new Ingreso(1000, "Venta de productos", "2025-02-09");
        String resultadoIngreso = ingreso.procesarTransaccion();  
        System.out.println(resultadoIngreso); 

        System.out.println(); 

        //egreso
        Transaccion egreso = new Egreso(500, "Pago de proveedores", "2025-02-09");
        String resultadoEgreso = egreso.procesarTransaccion();
        System.out.println(resultadoEgreso);
        System.out.println("Prueba Adry");
        System.out.println("Prueba Adry2");
        System.out.println("Prueba Adry3");
        //Prueba
    }
}
