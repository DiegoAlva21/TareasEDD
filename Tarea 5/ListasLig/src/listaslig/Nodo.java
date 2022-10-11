
package listaslig;


public class Nodo {
    Object valor;
    Nodo siguiente;
    
    public Nodo(Object valor){
        this.valor = valor;
        this.siguiente = null;
        
    }

   
    public Object getDato(){
        return valor;
    }
    
    public void setSiguiente(Nodo n){
        siguiente = n;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    
   
    
    
           
        
    
}
