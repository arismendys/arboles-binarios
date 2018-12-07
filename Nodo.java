/*
 Esta clase nos permitira crear nuestros Nodos en las deferentes clases que necesitemos.
 
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
