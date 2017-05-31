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
public class NodoArbol
{

    private String clave;
    private Object obj;
    private NodoArbol izq;
    private NodoArbol der;

    public NodoArbol()
    {
    }

    public NodoArbol(String clave, Object obj)
    {
        this.clave = clave;
        this.obj = obj;
        this.izq = null;
        this.der = null;
    }

    /**
     * @return the clave
     */
    public String getClave()
    {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave)
    {
        this.clave = clave;
    }

    /**
     * @return the obj
     */
    public Object getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Object obj)
    {
        this.obj = obj;
    }

    /**
     * @return the izq
     */
    public NodoArbol getIzq()
    {
        return izq;
    }

    /**
     * @param izq the izq to set
     */
    public void setIzq(NodoArbol izq)
    {
        this.izq = izq;
    }

    /**
     * @return the der
     */
    public NodoArbol getDer()
    {
        return der;
    }

    /**
     * @param der the der to set
     */
    public void setDer(NodoArbol der)
    {
        this.der = der;
    }

    public String desp()
    {
        return "Clave: " + clave;
    }

}
