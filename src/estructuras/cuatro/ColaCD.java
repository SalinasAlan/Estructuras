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
public class ColaCD implements OpEDD
{

    private Nodo atras;

    public ColaCD()
    {
        atras = null;
    }

    /**
     * @return the atras
     */
    public Nodo getAtras()
    {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(Nodo atras)
    {
        this.atras = atras;
    }

    @Override
    public boolean vacia()
    {
        if (atras == null)
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
            return "No se puede insertar objetos";
        } else if (vacia())
        {
            atras = (Nodo) obj;
            atras.setSig(atras);
        } else
        {
//            ((Nodo) obj).getSig();
            ((Nodo) obj).setSig(atras.getSig());
            atras.setSig((Nodo) obj);
            atras = (Nodo) obj;
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
            Nodo aux = atras.getSig();
            if (atras == aux)
            {
                atras = aux = null;
            } else
            {
                atras.setSig(aux.getSig());
            }
            aux.setSig(null);
            return null;
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
