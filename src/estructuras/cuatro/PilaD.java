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
public class PilaD implements OpEDD
{

    Nodo t;

    public PilaD()
    {
        t = null;
    }

    @Override
    public boolean vacia()
    {
        if (t == null)
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String inserta()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String inserta(Object obj)
    {
        if (obj == null)
        {
            return "No se pudo insertar";
        } else
        {
            ((Nodo) obj).setSig(t);
            t = ((Nodo) obj);
        }
        return "Objeto insertado";
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
    public Object elimina()
    {
        if (vacia())
        {
            return null;
        } else
        {
            Nodo aux = t;
            t = t.getSig();
            aux.setSig(null);
            return aux;
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
