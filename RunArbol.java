/*
En esta clase probarimos crear un arbol binario con los datos que enviamos en un arreglos de enteros en la variable valores.

Para esto recorreremos en arreglo de enteros hasta su tamaño con un for, en este iremos creando nuevos nodos y añadiendo 
esos nodos a nuestro arbol binario, luego de que termine el ciclo usaremos los metodos de recorrido (Pre,In,Post)Orden 
con recursividad y sin recursividad.


*/
public class RunArbol {
    public static void main(String[] args){
        Nodo n;
        Arbol arbolbinario = new Arbol();
        int[] valores = {60, 75, 66, 85, 42, 14, 73, 72, 2, 54};
        //int[] valores = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        
        System.out.println("\033[35mCreando Arbol Binario con los siguientes Datos:");
        for(int i=0;i<valores.length; i++)
        {
            System.out.print(" \033[32m"+valores[i]);
            n = new Nodo();
            n.setData(valores[i]);
            arbolbinario.add(n);
        }
        System.out.println("\033[34m\nRecorriendo el arbol en PreOrden con Recursividad:\033[32m");
        arbolbinario.PreOrden(arbolbinario.raiz());
        
        System.out.println("\033[31m\nRecorriendo el arbol en PreOrden sin Recursividad:\033[32m");
        arbolbinario.PreOrdenUsandoCola(arbolbinario.raiz());
        
        System.out.println("\033[34m\nRecorriendo el arbol en InOrden con Recursividad:\033[32m");
        arbolbinario.InOrden(arbolbinario.raiz());
        
        System.out.println("\033[31m\nRecorriendo el arbol en InOrden sin Recursividad:\033[32m");
        arbolbinario.InOrdenUsandoCola(arbolbinario.raiz());
        
        System.out.println("\033[34m\nRecorriendo el arbol en PostOrden con Recursividad:\033[32m"); 
        arbolbinario.PostOrden(arbolbinario.raiz());
        
        System.out.println("\033[31m\nRecorriendo el arbol en PostOrden sin Recursividad:\033[32m");
        arbolbinario.PostOrdenUsandoPila(arbolbinario.raiz());
        
        System.out.print("\033[34m");
    }
    
}
