/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicosdanielmartinez;

/**
 *
 * @author Daimiel
 */


public class BasicosDanielMartinez {


 /**
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.err.print("Valor entero ");
        System.out.println(entero);
        System.out.print("Valor doble ");
        System.out.println(doble);
    }
    
    public static void cadenas() {
   //Estos son los tipos básicos
        String cadena;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        cadena="prueba tipo cadenas";

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        
        System.out.println(cadena);
}
    
    public static void logicos() {

       boolean logico;
       
       logico=true;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        if(logico==false){
        System.out.println("La variable logico es falsa");
        }
        if(logico==true){
         System.out.println("La variable logico es verdadera");   
        }
        

    }
 public static void main(String[] args) {
        numericos();  // Llamada al método

        cadenas();
        
        logicos();


    
}
 
}
