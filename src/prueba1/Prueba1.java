/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

/**
 *
 * @author Andres
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(imprimirTexto(true));
        unaFuncion();
        System.out.println(sumar(2, 8));
        System.out.println(multiplicar(2, 6));

    }
    
    //Función para saludar :)
    static private void unaFuncion() {
        String a = "hola";
        System.out.println(a);
    }
    
    //Función para generar una cadena de texto predefinida dada una condición
    static private String imprimirTexto(boolean imprimir){
        String retorno;

        if (imprimir) {
            retorno = "imprimir texto: ";
        }
        else {
            retorno="no imprimir texto ";
        }

        return retorno;
    }
    
    //Funcion para sumar 2 numeros
    static private Integer sumar(int p1, int p2) {
        return p1 + p2;
    }
            
            
    //Función para multiplicar 2 numeros
    static private Integer multiplicar(int p1, int p2) {
        return p1 * p2;
    }
}
