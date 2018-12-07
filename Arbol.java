public class Arbol {
    private Nodo root;
    private int cant = 0;
    private int CantPreorden = 0;
    private int CantInorden = 0;
    private int CantPostorden = 0;
    
    Arbol (Nodo n){ root = n; }
    Arbol (){}
    
    public void add(Nodo n){
        Nodo l = root;
        cant++;
        if (root == null) root = n;
        else
        {
            for (;;){
                if((n.getData()>l.getData())&&(l.getRight()!=null)){
                l=l.getRight();
                }else{
                    if((n.getData()>l.getData())&&(l.getRight()==null))
                    {
                        l.setRightt(n);
                        break;
                    }else{
                        if((n.getData()<=l.getData()&&(l.getLeft()!=null))){
                            l=l.getLeft();
                        }else{
                            if((n.getData()<=l.getData())&&(l.getLeft()==null)){
                                l.setLeft(n);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
    
    public Nodo raiz(){ return root; }
    public int size(){ return cant; }
    public int sizePreOrden(){ return CantPreorden; }
    public int sizeInOrden(){ return CantInorden; }
    public int sizePostOrden(){ return CantPostorden; }
    public void PreOrden(Nodo l){
        CantPreorden++;
        System.out.print(" "+l.getData());
        if(l.getLeft()!=null)PreOrden(l.getLeft());
        if(l.getRight()!=null)PreOrden(l.getRight());
    }
    public void PreOrdenUsandoCola(Nodo l){
        if(l == null){
            return;
        }
        Colas cola = new Colas();
        Nodo t = l;
        Nodo k;
        while(t!=null){
            k=new Nodo();
            if(t.getLeft()==null){
                k.setData(t.getData());
                cola.push(k);
                t=t.getRight();
            }
            else{
                Nodo p = t.getLeft();
                while(p.getRight()!= t && p.getRight()!=null){
                    p=p.getRight();
                }
                if(p.getRight()==null){
                    p.setRightt(t);
                    k.setData(t.getData());
                    cola.push(k);
                    t=t.getLeft();
                }else{
                    p.setRightt(null);
                    t = t.getRight();
                }
            }
        }
        while(cola.size() !=0){
            System.out.print(" "+cola.pop().getData());
        }
    }
    public void InOrden(Nodo l){
    if(l.getLeft()!=null)InOrden(l.getLeft());
    CantInorden++;
    System.out.print(" "+l.getData());
    if(l.getRight()!=null)InOrden(l.getRight());
    }
    public void InOrdenUsandoCola(Nodo l){
        if(l == null){
            return;
        }
        Colas cola = new Colas();
        Nodo t = l;
        Nodo k;
        while(t!=null){
            k=new Nodo();
            if(t.getLeft()==null){
                k.setData(t.getData());
                cola.push(k);
                t=t.getRight();
            }
            else{
                Nodo p = t.getLeft();
                while(p.getRight()!= t && p.getRight()!=null){
                    p=p.getRight();
                }
                if(p.getRight()==null){
                    p.setRightt(t);
                    t=t.getLeft();
                }else{
                    p.setRightt(null);
                    k.setData(t.getData());
                    cola.push(k);
                    t = t.getRight();
                }
            }
        }
        while(cola.size() !=0){
            System.out.print(" "+cola.pop().getData());
        }
    }
    public void PostOrden(Nodo l){
    if(l.getLeft()!=null)PostOrden(l.getLeft());
    if(l.getRight()!=null)PostOrden(l.getRight());
    System.out.print(" "+l.getData());
    CantPostorden++;
    }
    public void PostOrdenUsandoPila(Nodo l){
        if(l == null){
            return;
        }
        Pilas pila = new Pilas();
        Nodo t = l;
        Nodo k;
        while(t!=null){
            k=new Nodo();
            if(t.getRight()==null){
                k.setData(t.getData());
                pila.push(k);
                t=t.getLeft();
            }
            else{
                Nodo p = t.getRight();
                while(p.getLeft()!= t && p.getLeft()!=null){
                    p=p.getLeft();
                }
                if(p.getLeft()==null){
                    k.setData(t.getData());
                    pila.push(k);
                    p.setLeft(t);
                    t=t.getRight();
                }else{
                    
                    p.setRightt(null);
                    t = t.getLeft();
                    
                }
            }
        }
        while(pila.size() !=0){
            System.out.print(" "+pila.pop().getData());
        }
    }
}
