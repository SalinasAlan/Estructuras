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
public class PrbPilasD
{

    public static void main(String[] args)
    {
        PilaD pd = new PilaD();

        String s1 = "Uno";
        String s2 = "Dos";
        String s3 = "Tres";
        String s4 = "Cuatro";

        Nodo n1 = new Nodo("s1", "s1");
        Nodo n2 = new Nodo("s2", "s2");
        Nodo n3 = new Nodo("s3", "s3");
        Nodo n4 = new Nodo("s4", "s4");

        System.out.println(pd.inserta(n1));
        System.out.println(pd.inserta(n2));
        System.out.println(pd.inserta(n3));
        System.out.println(pd.inserta(n4));
        
        System.out.println((String) ((Nodo) pd.elimina()).getObj());
        System.out.println((String) ((Nodo) pd.elimina()).getObj());
        System.out.println((String) ((Nodo) pd.elimina()).getObj());
        System.out.println((String) ((Nodo) pd.elimina()).getObj());

    }
}
