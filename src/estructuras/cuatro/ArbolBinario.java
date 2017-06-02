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
public class ArbolBinario implements OpEDD
{

    private NodoArbol r;

    public ArbolBinario()
    {
        r = null;
    }

    /**
     * @return the r
     */
    public NodoArbol getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(NodoArbol r)
    {
        this.r = r;
    }

    @Override
    public boolean vacia()
    {

        return r == null;   // ternario  correcto= r==null?true:false

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String inserta(Object r, Object obj)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object inserta(Object r, Object obj, boolean b)
    {
        if (r == null)
        {
            return obj;
        } else
        {
            if (((NodoArbol) r).getClave().compareTo(((NodoArbol) obj).getClave()) > 0)
            {
                ((NodoArbol) r).setIzq(((NodoArbol) inserta(((NodoArbol) r).getIzq(), obj, b)));
            } else
            {
                ((NodoArbol) r).setDer(((NodoArbol) inserta(((NodoArbol) r).getDer(), obj, b)));
            }
            return r;
        }
    }

    @Override
    public Object elimina()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public NodoArbol elimina(String cve, NodoArbol r, ArbolBinario a)
    {
        if (r != null)
        {
            if (!r.getClave().equals(cve))
            {
                if (r.getClave().compareTo(cve) > 0)
                {
                    r.setIzq(elimina(cve, r.getIzq(), a));
                } else
                {
                    r.setDer(elimina(cve, r.getDer(), a));
                }
            } else
            {
                a.setR(r);
                if (r.getIzq() == null && r.getDer() == null)
                {
                    return null;
                } else
                {
                    if (!(r.getIzq()!= null && r.getDer()!=null))
                    {
                        if (r.getIzq() != null)
                        {
                            return r.getIzq();
                        }else
                        {
                            return r.getDer();
                        }
                    }else
                    {
                        NodoArbol se, s2;
                        if (r.getDer().getIzq() == null)
                        {
                            se = r.getDer();
                        }else
                        {
                            s2 = sucesor(r.getDer());
                            se = s2.getIzq();
                            s2.setIzq(se.getDer());
                            se.setDer(r.getDer());
                        }
                        se.setIzq(r.getIzq());
                        r = se;
                    }
                }
            }
        }
        return r;
    }

    public NodoArbol sucesor(NodoArbol r)
    {
        if (r.getIzq().getIzq()!=null)
        {
            return sucesor(r.getIzq());
        }else
        {
            return r;
        }
    }
    
    public void rEnOrden(NodoArbol r)
    {
        if (r != null)
        {
            rEnOrden(r.getIzq());
            System.out.print(r.getClave() + "\t");
            rEnOrden(r.getDer());
        }
    }

    public void rPreOrden(NodoArbol r)
    {
        if (r != null)
        {
            System.out.print(r.getClave() + "\t");
            rPreOrden(r.getIzq());
            rPreOrden(r.getDer());
        }
    }

    public void rPosOrden(NodoArbol r)
    {
        if (r != null)
        {
            rPosOrden(r.getIzq());
            rPosOrden(r.getDer());
            System.out.print(r.getClave() + "\t");
        }
    }
}
