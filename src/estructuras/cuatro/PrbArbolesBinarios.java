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
public class PrbArbolesBinarios
{

    public static void main(String[] args)
    {
        NodoArbol n1 = new NodoArbol("E", "E");
        NodoArbol n2 = new NodoArbol("F", "F");
        NodoArbol n3 = new NodoArbol("M", "M");

        ArbolBinario ab = new ArbolBinario();

        ab.setR((NodoArbol) ab.inserta(ab.getR(), n2, true));
        ab.setR((NodoArbol) ab.inserta(ab.getR(), n1, true));
        ab.setR((NodoArbol) ab.inserta(ab.getR(), n3, true));
        
        ab.rEnOrden(ab.getR());
        System.out.println("**********");
        ab.rPreOrden(ab.getR());
        System.out.println("**********");
        ab.rPosOrden(ab.getR());
        System.out.println("**********");
    }
}
