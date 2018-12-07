public class Colas {
    private Nodo head;
    private int cant = 0;
    
    Colas (Nodo n){ 
        head = n; 
    }
    Colas (){}

        public void push (Nodo n){
            Nodo l = null;
            cant++;
            if (head == null) head = n;
            else
            {
                for (l = head; l.getRight()!= null; l=l.getRight());
                l.setRightt(n);
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
