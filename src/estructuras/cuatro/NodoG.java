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
public class NodoG
{

    private String clave;
    private Object obj;
    private NodoG abajo, arriba, sig;

    public NodoG(String clave, Object obj)
    {
        this.clave = clave;
        this.obj = obj;
        this.abajo = null;
        this.arriba = null;
        this.sig = null;
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
     * @return the abajo
     */
    public NodoG getAbajo()
    {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(NodoG abajo)
    {
        this.abajo = abajo;
    }

    /**
     * @return the arriba
     */
    public NodoG getArriba()
    {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(NodoG arriba)
    {
        this.arriba = arriba;
    }

    /**
     * @return the sig
     */
    public NodoG getSig()
    {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(NodoG sig)
    {
        this.sig = sig;
    }

}
