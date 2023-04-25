package ejercicios.guia3.ejercicio4;

import java.util.*;
public class Pila1<T> {
    ArrayList<T> arrayPila;
    int top = -1;
    int tamanho;
    Pila1(int tamanho) {
        // Storing the value of size into global variable
        this.tamanho = tamanho;
        // Creating array of Size = size
        this.arrayPila = new ArrayList<T>(tamanho);
    }
    // push-----------------
    void push(T elemento) {
        if (top + 1 == tamanho) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            this.arrayPila.add(elemento);
        }
    }
    // Pop------------------------
    T pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            T toret = this.arrayPila.get(top);
            this.arrayPila.remove(top);
            top--;
            return toret;
        }
    }
    // peek--------------------------------
    T peek() {
        if (top == -1) {
            System.out.println("array vac�o");
            return null;
        } else {
            return this.arrayPila.get(top);
        }
    }
    // reverse-
    void reverse() {
        Collections.reverse(this.arrayPila);
        }
}

