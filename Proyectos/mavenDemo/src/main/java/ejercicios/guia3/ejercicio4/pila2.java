package ejercicios.guia3.ejercicio4;


import java.util.ArrayList;
public class pila2 {
    private static ArrayList<String> pila = new ArrayList<String>();
    
    public static void main(String args[]) {
        //Relleno inicial array
        for(int i = 0; i <10; i++) {
            String add_valor = "" + i;
            
            push(add_valor, pila);
        }
 
    }
       
    public static void push(String nuevo_dato, ArrayList<String> pila) {
        pila.add(nuevo_dato);
    }
    
    public static String peek(ArrayList<String> pila){
        return pila.get(pila.size() - 1);
    }
    
    public static String pop(ArrayList<String> pila) {
        String valor_borrado = peek(pila);
        
        System.out.println("Valor eliminado:" + valor_borrado);
        
        return pila.remove(pila.size() - 1);
    }
    
    public static void mostrar_resultados(String valor) {
        System.out.println("Resultado:" + valor);
    }
    
    public static void reverse(ArrayList<String> pila) {
        ArrayList<String> pila_invertida = new ArrayList<String>();
        
        for (int i = pila.size() - 1; i >= 0 ; i--) {
            push(pila.get(i), pila_invertida);
        }
      
    }
}
