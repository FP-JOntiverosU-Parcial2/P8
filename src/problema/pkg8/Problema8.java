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
        a=solicitarDato("adyacente");
        b=solicitarDato("opuesto");
        o=operacion(a,b);
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
        o= Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
        System.out.println("La hipotenusa es igual a: " + o );
        return o;
    }
    
}
