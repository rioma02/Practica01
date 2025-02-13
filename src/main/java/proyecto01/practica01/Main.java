
package proyecto01.practica01;

import javax.swing.JFrame;

import proyecto01.ExcepcionTransaccion;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) throws ExcepcionTransaccion {
       GestionTransacciones gestion = new GestionTransacciones();

       gestion.mostrarMenu();

   }
    }

