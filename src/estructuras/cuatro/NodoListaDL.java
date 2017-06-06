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
public class NodoListaDL
{

    private String clave;
    private Object obj;
    private NodoListaDL siguiente;
    private NodoListaDL atras;

    public NodoListaDL(String clave, Object obj)
    {
        this.clave = clave;
        this.obj = obj;
        this.siguiente = null;
        this.atras = null;
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
     * @return the siguiente
     */
    public NodoListaDL getSiguiente()
    {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoListaDL siguiente)
    {
        this.siguiente = siguiente;
    }

    /**
     * @return the atras
     */
    public NodoListaDL getAtras()
    {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(NodoListaDL atras)
    {
        this.atras = atras;
    }

    
}
