/**
 * @author DAW120
   📌 EJERCICIO 1, Hoja 2. 
   🔴 ¿Qué valor tendrá las variables X e Y después de ejecutar las instrucciones?:
 */

package com.solomongo.ejercicio1_hoja2;
public class Ejercicio1_Hoja2 {
    public static void main(String[] args) {
  
    // programa CICLICO:
    int x=100;
    System.out.println("\nvalor de x: "+x);
    int x1=(x++); // incrementa X en 1, evalua ANTES: sale 101
    System.out.print("valor de x++: ");
    System.out.println(x++); // saca el valor de la variable x++
    
    int y=20; 
    System.out.println("\nvalor de y: "+y);
    int y2=(y--); // aqui decrece y en 1, evalua ANTES: sale 19
    System.out.print("valor de y--: ");
    System.out.println(y--); // saca el valor de la variable y--
    
    // Operador DE ASIGNACION:
    int total=  x += y; // Equivale a: total= total+valor(valor 101 sumado a 19)
                        // es lo que dará el resultado TOTAL: a x se le otorga (sumando),
                        // el valor de y, osea: x =(x+y) , saldrá: 120...
    // SALIDA:                    
    System.out.println("\n\tValor TOTAL: "+total); // saca valor FINAL de operacion
         System.out.println("\n - valor FINAL de x: "+x);
         System.out.println(" - valor FINAL de y: "+y+"\n");
    }
}
