/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n.ary.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mateo Valencia
 */
public class Nodo {
    private String nombre;
    private List<Nodo> hijos = new ArrayList<>();

    public Nodo (String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void addHijo(Nodo p){
        this.hijos.add(p);
    }
    
    public List<Nodo> getHijos() {
        return this.hijos;
    }
    
    public boolean isLeaf(Nodo nodo){
        return nodo.getHijos().isEmpty();
    }
    
}
