package org.fibonacci.model;
import java.util.HashMap;
public class Fibonacci {
    //Atributos
    private int numero; // Variable privada atributo de la clase
    HashMap<Integer,  Long> map = new HashMap();
    //Constructores
    public Fibonacci(int numero) { // Constructor con parámetros
        this.numero = numero;
    }
    public Fibonacci() { // Constructor vacío
        this.numero = 0;
    }
    //Getters y Setters
    public int getNumero() { // Getter sirve para obtener el valor de la variable
        return numero;
    }

    public void setNumero(int numero) { // Setter sirve para asignar un valor a la variable
        this.numero = numero;
    }
    //Métodos
    public long getFibonacci(int numero){
        if (map.containsKey(numero)) { // Si el HashMap contiene la clave numero
            return map.get(numero); // Retornar el valor de la clave
        }else{
            long resultado;
            if(numero == 0 || numero == 1){ // Caso base
                return 1;
            }else{
                resultado = getFibonacci(numero - 1) + getFibonacci(numero - 2);
            }
            map.put(numero, resultado); // Agregar la clave y el valor al HashMap
            return resultado;
        }
    }

    public String devolverPosicion( int numero){
      if(map.containsKey(numero)) {
          map.put(numero, getFibonacci(numero));
          return "Posición: " + numero;
      }else{
          return "El fibonacci se agrego en la lista";
      }
    }


}

