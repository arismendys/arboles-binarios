public class Lista {
    private Nodo head;
    private int cant = 0;
    
    Lista (Nodo n){ 
        head = n; 
    }
    Lista (){}

    public Nodo getHead() {
        return head;
    }
    public void Agregar (Nodo n){
        Nodo l = null;
        cant++;
        
        if (head == null) head = n;
        else
        {
            for (l = head; l.getRight()!= null; l=l.getRight());
                l.setRightt(n);
        }
    }
    public void AgregarPrimero (Nodo n){
        cant++;
        if (head == null) head = n;
        else
        {
            n.setRightt(head);
            head = n;
        }
    }
    public int size(){ 
        return cant; 
    }
    public Nodo get(int pos){
        int i = 0;
        Nodo l;
        if (cant >= pos && pos >= 0)
        {
            if(pos == 0) return head;
            for (i = 0, l = head ; i < pos ; i++, l = l.getRight());
                return (l);
        }
        return null;
    }
    public void Eliminar (Nodo d){
        Nodo l;
        cant--;
        if(d==head)
        {
            head=head.getRight();
        }
        else
        {
            for(l=head; l.getRight()!=d;l=l.getRight());
                l.setRightt(d.getRight());
        }  
    }
}
