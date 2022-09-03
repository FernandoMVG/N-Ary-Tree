/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n.ary.tree;

/**
 *
 * @author Mateo Valencia
 */
public class NAryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arbol arbol = new Arbol();
        
        arbol.insertNodo("HTML", null);
        arbol.insertNodo("Head", "HTML");
        arbol.insertNodo("Footer", "HTML");
        arbol.insertNodo("Body", "HTML");
        arbol.insertNodo("meta", "Head");
        arbol.insertNodo("Img", "Body");
        arbol.insertNodo("Img", "Body");
        arbol.insertNodo("a", "Body");
        arbol.insertNodo("li", "Body");
        arbol.insertNodo("ul", "Body");
        arbol.insertNodo("Img", "Body");
        arbol.insertNodo("Img", "Footer");
        
//        System.out.println(arbol.toString());
        
        System.out.println("_________________________________________");
        System.out.println("PreOrden: ");
        arbol.PreOrden(arbol.getRaiz());
        System.out.println("_________________________________________");
        System.out.println("PostOrden: ");
        arbol.PostOrden(arbol.getRaiz());
        System.out.println("_________________________________________");
        System.out.println("InOrden: ");
        arbol.InOrden(arbol.getRaiz());
    }
    
}
