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
public class PrbBicola
{

    public static void main(String[] args)
    {
        char s[] =
        {
            'M', 'E', 'X', 'I', 'C', 'O'
        };
        Bicola obj = new Bicola(6);

        for (int i = 0; i < s.length; i++)
        {
            if (s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U')
            {
                obj.setA1(obj.inserta(s[i], obj.getA1(), obj.getA2(), 1));
            } else
            {
                obj.setA2(obj.inserta(s[i], obj.getA2(), obj.getA1(), -1));
            }
            System.out.println(obj.getB());
        }

        int arr[] = new int[2];
        for (int i = 0; i < s.length; i++)
        {
            if (i % 2 == 0)
            {
                obj.setA1(arr[1]);
                arr = obj.elimina(obj.getA2(), s.length - 1, -1);
            } else
            {
                obj.setA1(arr[1]);
                arr = obj.elimina(obj.getA1(), 0, 1);
            }
            System.out.println("Dato eliminado= " + (char) arr[0]);
        }

    }
}
