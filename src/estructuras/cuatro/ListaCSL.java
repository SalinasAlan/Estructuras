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
public class ListaCSL implements OpEDD //lista circula simplemente ligada
{

    private Nodo r;

    public ListaCSL()
    {
        r = null;
    }

    /**
     * @return the r
     */
    public Nodo getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(Nodo r)
    {
        this.r = r;
    }

    @Override
    public boolean vacia()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            return "No se puede insertar";
        } else
        {
            Nodo o = (Nodo) obj;
            if (r == null)
            {
                r = o;
                r.setSig(r);
            } else if (r.getSig().getClave().compareTo(o.getClave()) < 0 || o.getClave().compareTo(r.getClave()) < 0)
            {
                o.setSig(r.getSig());
                r.setSig(o);
                o.setSig(o);
                if (o.getClave().compareTo(r.getClave()) < 0)
                {
                    r = o;
                }
            } else
            {
                Nodo aux = r.getSig();
                Boolean b = true;
                while (b)
                {
                    if (aux.getSig().getClave().compareTo(o.getClave()) > 0)
                    {
                        b = false;
                        o.setSig(aux.getSig());
                        aux.setSig(o);
                    } else
                    {
                        aux = aux.getSig();
                    }
                    break;
                }
            }
            return "Dato insertado";
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
    public Object elimina()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object elimina(Object obj)
    {
        String clave = (String) obj;
        if (r == null)
        {
            return null;

        } else if (clave.compareTo(r.getSig().getClave()) < 0 || clave.compareTo(r.getClave()) > 0)
        {
            return null;
        }
        if (clave.compareTo(r.getClave()) < 0)
        {
            return null;
        } else
        {
            Nodo aux = null;
            if (r.getSig().getClave().equals(clave))
            {
                r.setSig(aux.getSig());
                aux = r;
            } else
            {
                Nodo aux2;
                aux2 = r.getSig();
                boolean b = true;
                while (aux2.getSig() != r.getSig() && b)
                {
                    if (aux2.getSig().getClave().compareTo(clave) > 0)
                    {
                        return null;
                    } else if (aux2.getSig().getClave().equals(clave))
                    {
                        b = false;
                        aux = aux2.getSig();
                        aux2.setSig(aux.getSig());
                        if (aux == r)
                        {
                            r = aux2;
                        }
                    } else
                    {
                        aux2 = aux2.getSig();
                    }
                }

            }
            if (aux != null)
            {
                aux.setSig(null);
            }
            return aux;
        }
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
