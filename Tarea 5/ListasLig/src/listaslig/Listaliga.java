/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaslig;


public class Listaliga {
    
    Nodo head;
    int size;
    
    public Listaliga(){
        head = null;
        size = 0;
}
    public Object get(int index){
        int contador = 0;
        Nodo temporal = head;
        while(contador < index){
            temporal = temporal.getSiguiente();
            contador++;
        }
        return temporal.getDato();
    }
    public void agregarAlfinal(Object obj){
        if(head == null){
            head = new Nodo(obj);
        }
        else{
            Nodo temp = head;
            Nodo nuevo = new Nodo(obj);
            nuevo.setSiguiente(temp);
            head = nuevo;
        }
        size--;
    }
    public void agregarAlinicio(Object obj){
        if(head == null){
            head = new Nodo(obj);
        }
        else{
            Nodo temp = head;
            Nodo nuevo = new Nodo(obj);
            nuevo.setSiguiente(temp);
            head = nuevo;
        }
        size++;
    }
    public void eliminar(int index){
        if(index==0){
            head = head.getSiguiente();
        }
        else{
            int contador = 0;
        Nodo temporal =  head;
        while(contador < index -1){
            temporal = temporal.getSiguiente();
            contador++;
        }
        temporal.setSiguiente(
        temporal.getSiguiente().getSiguiente());
        }
        size--;
        
    }
    
    public void eliminarPrimero(){
        head = head.getSiguiente();
                size--;
                
    }
    public int size(){
        return size;
    }
    public boolean estaVacia(){
        return (head == null)?true:false;
    }




}