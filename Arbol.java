/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n.ary.tree;
//import n.ary.tree.Nodo;
/**
 *
 * @author Mateo Valencia
 */
public class Arbol {
    private Nodo raiz;
    
    public Arbol() {
        this.raiz = null;
    }
    
    public Nodo getRaiz(){
        return this.raiz;
    }
    
    Nodo resultado = null;
    public Nodo BusquedaRecursiva(String padre){
        resultado = null;
        return BusquedaRecursiva(raiz, padre);
    }
    
    public Nodo BusquedaRecursiva(Nodo nodo, String padre){
        if (nodo == null) {
            resultado = null;
            System.out.println("Buscando, nodo actual "+nodo.getNombre()+" nodo padre: " +padre);
        }
        if (padre == nodo.getNombre()){
            resultado = nodo;
        }
        
        for (Nodo hijo : nodo.getHijos()){
            if (resultado != null) {
                break;
            } 
            else {
                BusquedaRecursiva(hijo, padre);
            }
        }
        
        return resultado;
    }
    
    
    
    public void insertNodo (String nombre, String padre){
        if (getRaiz()== null){
            System.out.println("Insertando nodo raiz");
            this.raiz = new Nodo(nombre);
        }else{ 
            Nodo nodoPadre = BusquedaRecursiva(padre); 
            System.out.println("Nodo Padre " + nodoPadre.getNombre());
            if (nodoPadre != null){
                nodoPadre.addHijo(new Nodo(nombre));
            } else {
                raiz.getHijos().add(new Nodo(nombre));
            }
        }
    }
    
    public void PreOrden(Nodo nodo){
        if (nodo == null) return; 
        System.out.print(nodo.getNombre() + ", ");
        nodo.getHijos().forEach((temp) -> {
            PreOrden(temp);
        });
            
        
    }
    
    public void PostOrden(Nodo nodo){
        if (nodo == null) return;
        for(Nodo temp : nodo.getHijos()){
            PostOrden(temp);
        }
         System.out.print(nodo.getNombre() + ", ");
    }
    
    public void InOrden(Nodo nodo){
        if (!nodo.isLeaf(nodo)){
            InOrden(nodo.getHijos().get(0));
            System.out.print(nodo.getNombre() + ", ");
            for(int i = 1; i < nodo.getHijos().size(); i++){
                InOrden(nodo.getHijos().get(i));
            }
        } else {
            System.out.print(nodo.getNombre() + ", ");
        }
    }
}
