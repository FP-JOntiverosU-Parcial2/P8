/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg8;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,o;
        a=solicitarDato("adyacente");// se piden los datos
        b=solicitarDato("opuesto");
        o=operacion(a,b);
        mensajeSalida();
    }
    public static double solicitarDato(String d){ 
        double dato;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el cateto " + d);
        dato= teclado.nextInt();
        return dato;
    }
    public static double operacion(double a, double b){
        double o;
        o= Math.sqrt(Math.pow(a,2)+ Math.pow(b,2)); // se pide la raiz del resultado de la operacion
        System.out.println("La hipotenusa es igual a: " + o ); //se muestra el resultado
        return o;
    }
    public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa"); //Se agradece por usar el programa
       System.exit(0);
    }
}
