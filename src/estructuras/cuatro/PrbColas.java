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
public class PrbColas
{

    public static void main(String[] args)
    {
        Colas c = new Colas(5);

        System.out.println(c.inserta("MS1"));
        System.out.println(c.inserta("MS2"));
        System.out.println(c.inserta("MS3"));
        System.out.println(c.inserta("MS4"));
        System.out.println(c.inserta("MS5"));
        System.out.println((String) c.elimina());
        System.out.println((String) c.elimina());
        System.out.println((String) c.elimina());
        System.out.println((String) c.elimina());
        System.out.println((String) c.elimina());
        System.out.println((String) c.elimina());
        System.out.println((String) c.elimina());

        ColasCircular c1 = new ColasCircular(5);
        
        System.out.println(c1.inserta("MS1"));
        System.out.println(c1.inserta("MS2"));
        System.out.println(c1.inserta("MS3"));
        System.out.println(c1.inserta("MS4"));
        System.out.println(c1.inserta("MS5"));
        System.out.println((String) c1.elimina());
        System.out.println((String) c1.elimina());
        System.out.println((String) c1.elimina());
        System.out.println((String) c1.elimina());
        System.out.println((String) c1.elimina());        
    }
}
