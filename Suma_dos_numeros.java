import java.util.*;
/**
 * Programa para sumar dos Números entre 1 y 100.
 * 
 * @author (Juan León-Leonardo Sotelo) 

 */
public class Suma_dos_numeros
{
    public static void main(String [] args) {
       double número_1;
       double número_2;
       double Suma;
       
    
     Scanner teclado = new Scanner (System.in);
     System.out.print( "Dos números entre 1 y 100, separados por espacio :");
     número_1 =teclado.nextDouble (); número_2= teclado.nextDouble ();
     
     Suma = número_1 + número_2;
     System.out.println("Suma" + Suma);
     }
}
