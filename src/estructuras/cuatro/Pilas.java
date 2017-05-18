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
public class Pilas implements OpEDD
{

    private String p[];
    private int tope = -1;

    public Pilas(int n)
    {
        p = new String[n];
    }

    /**
     * @return the p
     */
    public String[] getP()
    {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(String[] p)
    {
        this.p = p;
    }

    @Override
    public boolean vacia()
    {
        if (tope == -1)
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
        if (tope + 1 == p.length)
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
            p[++tope] = (String) obj;
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
            return p[tope--];
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
