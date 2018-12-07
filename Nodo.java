/*
 Esta clase nos permitira crear nuestros Nodos en las deferentes clases que necesitemos.
 
* El metodo setData recibe un dato tipo Object el cual se almacenara en el nodo
* El metodo setNext recibe el nodo que ira despues del nodo actual
* El metodo setBefore recibe el nodo antorior al que apuntara el actual
* El metodo getData retorna un tipo Object con los datos contenidos en un nodo
* El metodo getBefore retorna el nodo anterior al nodo actual
* El metodo getNext retorna al nodo en la posicion siguiente al nodo actual 
 
 Para utilizar en otras clases recomiendo cambiar setData y getData a Object, la utilizaremos como int para trabajar
 nuestro Arbol Binario.
 
*/
public class Nodo {
    private int data;
    private Nodo derecha;
    private Nodo izquierda;
    public void setData(int o){
        data=o;
    }
    public int getData(){
        return data;
    }
    public Nodo getRight(){
        return derecha;
    }
    public void setRightt(Nodo n){
        derecha=n;
    }
    public Nodo getLeft(){
        return izquierda;
    }
    public void setLeft(Nodo n){
        izquierda=n;
    }

}
