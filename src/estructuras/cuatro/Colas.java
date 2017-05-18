/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.cuatro;

import Machito.OpEDD;

/**
 *
 * @author Salinas
 */
public class Colas implements OpEDD
{

    private String c[];
    private int a = -1;

    public Colas(int n)
    {
        c = new String[n];
    }

    /**
     * @return the c
     */
    public String[] getC()
    {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(String[] c)
    {
        this.c = c;
    }

    @Override
    public boolean vacia()
    {
        if (a == -1)
        {
            return true;
        } else
        {
            return false;
        }
    }

    @Override
    public boolean llena()
    {
        if (a + 1 == c.length)
        {
            return true;
        } else
        {
            return false;
        }
    }

    @Override
    public String inserta()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public String inserta(Object obj)
    {
        if (llena())
        {
            return "Pila llena";
        } else
        {
            c[++a] = (String) obj;
            return "Dato insertado correctamente";
        }
    }

    @Override
    public String inserta(Object r, Object obj)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object inserta(Object r, Object obj, boolean b)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String elimina()
    {
        if (vacia())
        {
            return null;
        } else
        {
            String x = c[0];
            for (int i = 0; i < a; i++)
            {
                c[i] = c[i + 1];
            }
            a--;
            return x;
        }
    }

    @Override
    public Object elimina(Object obj)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public Object elimina(Object r, Object obj)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object elimina(Object r, Object obj, boolean b)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
