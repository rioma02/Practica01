
package proyecto01.practica01;

import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ingreso
        Transaccion ingreso = new Ingreso(1000, "Venta de productos", "2025-02-09");
        String resultadoIngreso = ingreso.procesarTransaccion();  
        System.out.println(resultadoIngreso); 


        //egreso
        Transaccion egreso = new Egreso(500, "Pago de proveedores", "2025-02-09");
        String resultadoEgreso = egreso.procesarTransaccion();
        System.out.println(resultadoEgreso);



        //Lista de Egreso
        List <Egreso> EgresoList = new ArrayList<>();


        //Lista de Ingreso
        List <Ingreso> IngresoList = new ArrayList<>();

    }
    }

