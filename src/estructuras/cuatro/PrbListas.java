/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.cuatro;

/**
 *
 * @author Salinas
 */
public class PrbListas
{

    public static void main(String[] args)
    {
        ListaSL l = new ListaSL();

        String s1 = "uno";
        String s2 = "dos";
        String s3 = "tres";
        String s4 = "cuatro";

        Nodo n1 = new Nodo("s1", "s1");
        Nodo n2 = new Nodo("s2", "s2");
        Nodo n3 = new Nodo("s3", "s3");
        Nodo n4 = new Nodo("s4", "s4");

        System.out.println(l.inserta(n1));
        System.out.println(l.inserta(n2));
        System.out.println(l.inserta(n3));
        System.out.println(l.inserta(n4));

        
        System.out.println((String)((Nodo)l.elimina(n4.getClave())).getObj());
    }
}
