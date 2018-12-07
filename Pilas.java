/*
Las Pilas son como una Lista, pero en estas el utimo dato en entrar es el primero en salir.

* El metodo push nos servira para introducir un nodo en la pila y lo convierte de inmediato en el primer valor de esta.
* El metodo pop nos permite sacar el primer elemento de pila y al mismo tiempo nos va reduciendo el tamaño de la pila.
* El metodo peek nos permite visializar cual es el primer valor de nuestra pila sin afectar el contenido de esta.
* El metodo size lo utilizaremos para visializar el tamaño de la pila.

Cuando vaciamos una pila su tamaño final sera 0 debido a que el metodo pop reduce la cantidad de nodos restantes en la pila
a medida que toma una nodo.
*/
public class Pilas {
    private Nodo head;
    private int cant = 0;
    
    Pilas (Nodo n){ 
        head = n; 
    }
    Pilas (){}
         public void push (Nodo n){
            cant++;
            if (head == null) head = n;
            else
            {
                n.setRightt(head);
                head = n;
            }
        }
        public Nodo pop() {
            Nodo l=head;
            head=head.getRight();
            cant--;
            return l;
            
        }
        public Object peek(){
            return head.getData();
        }
        public int size(){ 
            return cant; 
        }
}
