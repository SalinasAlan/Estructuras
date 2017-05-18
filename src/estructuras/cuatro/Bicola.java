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
public class Bicola
{

    private char b[];
    private int a1;
    private int a2;

    public Bicola(int n)
    {
        a1 = -1;
        a2 = n;
        b = new char[n];
    }

    /**
     * @return the b
     */
    public char[] getB()
    {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(char[] b)
    {
        this.b = b;
    }

    /**
     * @return the a1
     */
    public int getA1()
    {
        return a1;
    }

    /**
     * @param a1 the a1 to set
     */
    public void setA1(int a1)
    {
        this.a1 = a1;
    }

    /**
     * @return the a2
     */
    public int getA2()
    {
        return a2;
    }

    /**
     * @param a2 the a2 to set
     */
    public void setA2(int a2)
    {
        this.a2 = a2;
    }

    public int inserta(char c, int a, int lim, int fact)
    {
        if (a + fact == lim)
        {
            System.out.println("Cola llena");
        } else
        {
            b[a + fact] = c;
            burbuja();
        }
        return a + fact;
    }

    public int[] elimina(int a, int f, int fact)
    {
        int arr[] = new int[2];
        if (a == f - fact)
        {
            System.out.println("Cola vacia");
            arr[0] = -1;
            arr[1] = a;
        } else
        {
            arr[0] = b[f];
            for (int i = f; i != a; i += fact)
            {
                b[i] = b[i + fact];
            }
            a -= fact;
            arr[1] = a;
        }
        return arr;
    }

    public void burbuja()
    {
        for (int i = 0; i < b.length - 1; i++)
        {
            for (int j = 0; j < b.length - 1 - i; j++)
            {
                if (b[j] > b[j + 1])
                {
                    int aux = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = (char) aux;
                }
            }
        }
    }
}
