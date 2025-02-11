
package proyecto01.practica01;

import javax.swing.JFrame;

import proyecto01.ExcepcionTransaccion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ExcepcionTransaccion{
        double capital =1500;

        //ingreso
        try {
            Transaccion ingreso = new Ingreso(1000, "Venta de productos", "2025-02-09");
            if(ingreso.getMonto() < 0){
                throw new ExcepcionTransaccion("El monto no puede ser negativo");
            }
            capital += ingreso.getMonto();
            String resultadoIngreso = ingreso.procesarTransaccion();        
            System.out.println(resultadoIngreso);
        } catch (Exception ExcepcionTransaccion) {
            System.out.println("Error de transacción: " + ExcepcionTransaccion.getMessage());
        }


        //egreso
        try {
            Transaccion egreso = new Egreso(500, "Pago de proveedores", "2025-02-09");
            if(egreso.getMonto() > capital){
                throw new ExcepcionTransaccion("El egreso excede el capital disponible");
            }
            String resultadoEgreso = egreso.procesarTransaccion();
            System.out.println(resultadoEgreso);
        } catch (Exception ExcepcionTransaccion) {
            System.out.println("Error de transacción: " + ExcepcionTransaccion.getMessage());
        }


        //Lista de Egreso
        List <Egreso> EgresoList = new ArrayList<>();


        //Lista de Ingreso
        List <Ingreso> IngresoList = new ArrayList<>();

    }
    }

