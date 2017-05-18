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
public class ColasCircular implements OpEDD
{

    private String c[];
    private int a = -1, f = -1;

    public ColasCircular(int n)
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

    /**
     * @return the a
     */
    public int getA()
    {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void seta(int a)
    {
        this.a = a;
    }

    /**
     * @return the f
     */
    public int getF()
    {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(int f)
    {
        this.f = f;
    }

    @Override
    public boolean vacia()
    {
        if (getA() == -1)
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
        if (((getA() + 1 == c.length) && (f == 0)) || (a + 1 == f))
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
            return "Cola llena";
        } else if (a == -1)
        {
            a = 0;
            f = 0;
        } else if (a + 1 == c.length)
        {
            a = 0;
            a++;
        }
        c[a] = (String) obj;
        return "Dato insertado correctamente";
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
            String x = c[f];
            if (f == a)
            {
                f = a = -1;
            } else if (f + 1 == c.length)
            {
                f = 0;
            } else
            {
                f++;
            }
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
