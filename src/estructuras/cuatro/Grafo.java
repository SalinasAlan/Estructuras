/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.cuatro;

import java.util.ArrayList;


/**
 *
 * @author Salinas
 */
public class Grafo
{

    public static String cubiculo = "";
    public static ArrayList<ADeA> al = new ArrayList<ADeA>();

    public static NodoG buscar(String cad, NodoG rp)
    {
        NodoG loc = rp;
        do
        {
            if (loc.getClave().equals(cad))
            {
                return loc;
            }
            loc = loc.getSig();
        } while (loc != null);
        return null;
    }

    public static NodoG inserta(NodoG n, NodoG aux, int nivel, String s[])
    {
        if (nivel < s.length - 1)
        {
            NodoG tmp = buscar(s[nivel], aux);
            tmp.setAbajo(inserta(n, tmp.getAbajo(), nivel + 1, s));
            tmp.getAbajo().setArriba(tmp);
        } else
        {
            ListaSLG l = new ListaSLG();
            l.setR(aux);
            l.inserta(n);
            aux = l.getR();
        }
        return aux;
    }

    public static NodoG[] elimina(String clave, NodoG aux, int nivel, String[] s)
    {
        NodoG[] g = new NodoG[2];
        if (nivel < s.length - 1)
        {
            NodoG tmp = buscar(s[nivel], aux);
            g = elimina(clave, tmp.getAbajo(), nivel + 1, s);
            tmp.setAbajo(g[1]);
            if (g[1] != null)
            {
                tmp.getAbajo().setArriba(tmp);
            }
        } else
        {
            ListaSLG l = new ListaSLG();
            l.setR(aux);
            g[0] = (NodoG) l.elimina(clave);
            aux = l.getR();
            if (g[1] != null)
            {
                g[0].setArriba(null);
            }
        }
        g[1] = aux;
        return g;
    }

    public static void agrupa(NodoG g, ADeA a, int nivel, ArrayList<ADeA> tmp)
    {

        if (g != null)
        {
            a.getArr()[nivel] = g;
            agrupa(g.getAbajo(), a, nivel + 1, tmp);
            agrupa(g.getSig(), a, nivel, tmp);

        } else
        {
            ADeA b = new ADeA();
            for (int i = 0; i < a.getArr().length; i++)
            {
                b.getArr()[i] = a.getArr()[i];
            }
            if (nivel < 3)
            {
                if (a.getArr()[nivel] != tmp.get(tmp.size() - 1).getArr()[nivel])
                {
                    tmp.add(b);
                } else
                {
                    a.getArr()[nivel] = null;
                }
            } else
            {
                tmp.add(b);
            }
        }
    }

    public static void desp(ArrayList<ADeA> a)
    {
        for (int i = 0; i < a.size(); i++)
        {
//            System.out.println(i + ".-" + ((Departamento) a.get(i).arr[0].getObj()).desp());
//            System.out.println(i + ".-" + ((Personal) a.get(i).arr[1].getObj()).desp());
//            System.out.println(i + ".-" + ((Almacen) a.get(i).arr[2].getObj()).desp());
        }
    }

    public static void carga(NodoG r)
    {
        ADeA arr = new ADeA();

        agrupa(r, arr, 0, al);
        desp(al);
    }

//    public static void asocia(int p)
//    {
//        cubiculo = Integer.parseInt((Personal) al.get(p).getArr()[1].getObj()).getCubiculo();
//    }

}
