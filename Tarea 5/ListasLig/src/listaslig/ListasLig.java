/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaslig;


public class ListasLig {

    
    public static void main(String[] args) {
        
        Listaliga lista = new Listaliga();
        System.out.println("Esta vacia: "+ lista.estaVacia());
        lista.agregarAlinicio(10);
        lista.agregarAlinicio(35);
        lista.agregarAlinicio(76);
        lista.agregarAlinicio(89);
        lista.agregarAlinicio(34);
        lista.eliminar(2);
        lista.agregarAlfinal(97);
        
        System.out.println("Primer elemento: "+ lista.get(0));
        System.out.println("Ultimo elemento: "+ lista.get(lista.size()-1));
        System.out.println("Nodo 2: "+ lista.get(2));        
        System.out.println("Esta vacia: "+ lista.estaVacia());
        System.out.println("Tamaño: "+ lista.size());
        
        
    }
    
}
