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
public class PrbPilas
{

    public static void main(String[] args)
    {
        Pilas p = new Pilas(5);

        System.out.println(p.inserta("MS1"));
        System.out.println(p.inserta("MS2"));
        System.out.println(p.inserta("MS3"));
        System.out.println(p.inserta("MS4"));
        System.out.println(p.inserta("MS5"));
        System.out.println((String) p.elimina());
        System.out.println((String) p.elimina());
        System.out.println((String) p.elimina());
        System.out.println((String) p.elimina());
        System.out.println((String) p.elimina());
        System.out.println((String) p.elimina());
        System.out.println((String) p.elimina());

    }
}
