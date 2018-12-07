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
