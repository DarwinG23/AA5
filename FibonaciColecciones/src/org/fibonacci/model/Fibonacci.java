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
    public long calcularFibonacci(int numero){
        if (map.containsKey(numero)) { // Si el HashMap contiene la clave numero
            return map.get(numero); // Retornar el valor de la clave
        }else{
            long resultado;
            if(numero == 0 || numero == 1){ // Caso base
                return 1;
            }else{
                resultado = calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2); // Caso recursivo
            }
            map.put(numero, resultado); // Agregar la clave y el valor al HashMap
            return resultado;
        }
    }

}

