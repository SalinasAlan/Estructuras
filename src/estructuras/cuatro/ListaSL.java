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
public class ListaSL implements OpEDD //lista simplemente ligada
{

    private Nodo r;

    public ListaSL()
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
        if (r == null)
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

//    @Override
//    public String inserta(Object obj)
//    {
//        boolean bandera = true;
//        if (obj == null)
//        {
//            System.out.println("No se puede insertar");
//        } else
//        {
//            Nodo o = (Nodo) obj;
//            if (r == null)
//            {
//                r = o;
//            } else if (r.getClave().compareTo(o.getClave()) > 0)
//            {
//                o.setSig(r);
//                r = o;
//            }
//
//            Nodo aux = r;
//
//            while (aux.getSig() != null && bandera)
//            {
//                if (aux.getSig().getClave().compareTo(o.getClave()) > 0)
//                {
//                    bandera = false;
//                    o.setSig(aux.getSig());
//                    aux.setSig(o);
//                } else
//                {
//                    aux = aux.getSig();
//                }
//            }
//            if (aux != null)
//            {
//                aux.setSig(null);
//            }
//
//        }
//        return "Dato insertado";
//    }
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
            } else if (r.getClave().compareTo(o.getClave()) > 0)
            {
                o.setSig(r);
                r = o;
            } else
            {
                Nodo aux = r;
                Boolean b = true;
                while (aux.getSig() != null && b)
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
                }
                if (b == true)
                {
                    aux.setSig(o);
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

//    @Override
//    public Object elimina(Object obj)
//    {
//        String clave = (String) obj;
//        Nodo aux;
//        aux = null;
//        if (r == null)
//        {
//            return null;
//        } else if (clave.compareTo(r.getClave()) < 0)
//        {
//            return null;
//        } else{ if (r.getClave().equals(clave))
//        {
//            aux = r;
//            r = r.getSig();
//        } else
//        {
//            Nodo aux2 = r;
//            boolean bandera = true;
//            while (aux2.getSig() != null && bandera)
//            {
//                if (aux2.getSig().getClave().compareTo(clave) > 0)
//                {
//                    return null;
//                } else
//                {
//                    if (aux2.getSig().getClave().equals(clave))
//                    {
//                        bandera = false;
//                        aux = aux2.getSig();
//                        aux2.setSig(aux.getSig());
//                    } else
//                    {
//                        aux2 = aux2.getSig();
//                    }
//                }
//            }
//
//        }
//
//        if (aux != null)
//        {
//            aux.setSig(null);
//        }
//        return aux;
//        }
//    }
    @Override
    public Object elimina(Object obj)
    {
        String clave = (String) obj;
        if (r == null)
        {
            return null;
        } else if (clave.compareTo(r.getClave()) < 0)
        {
            return null;
        } else
        {
            Nodo aux = null;
            if (r.getClave().equals(clave))
            {

                aux = r;
                r = r.getSig();
            } else
            {
                Nodo aux2;
                aux2 = r;
                boolean b = true;
                while (aux2.getSig() != null && b)
                {
                    if (aux2.getSig().getClave().compareTo(clave) > 0)
                    {
                        return null;
                    } else if (aux2.getSig().getClave().equals(clave))
                    {
                        b = false;
                        aux = aux2.getSig();
                        aux2.setSig(aux.getSig());
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
