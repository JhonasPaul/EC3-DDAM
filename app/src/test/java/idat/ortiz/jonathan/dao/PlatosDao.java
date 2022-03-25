package idat.ortiz.jonathan.dao;

import java.util.ArrayList;
import java.util.List;

import idat.ortiz.jonathan.entidades.Platos;

public class PlatosDao {
    static List<Platos> lista = new ArrayList<Platos>();

//    public  List<Platos> ListarPlato() {return lista;}

    public List<String> ListarPlatosString(){
        List<String> listapla = new ArrayList<String>();

        for (Platos fila: lista){
            listapla.add("Codigo: " + fila.getCod_plato() + "\n"+
                    "Nombre: " + fila.getNom_plato() + "\n"+
                    "Precio: " + fila.getPrecio_plato());
        }
        return listapla;
    }

    public String GrabarPlato(Platos obj)
    {
        Platos encontrado = BuscarPlatos(obj.getCod_plato());

        String mensaje="Error, Codigo de la Plato ya Existe";

        if (encontrado == null) {
            lista.add(obj);
            mensaje="Platos grabado correctamente";
        }

        return mensaje;
    }

    public String EliminarPlato(int codigo)
    {
        Platos encontrado = BuscarPlatos(codigo);
        String mensaje="Error, el codigo no existe";
        if(encontrado != null)
        {
            lista.remove(encontrado);
            mensaje ="Plato eliminado satisfactoriamente";
        }

        return mensaje;
    }

    public Platos BuscarPlatos(int codigo)
    {
        Platos sw=null;

        for (Platos x: lista)
        {

            if (x.getCod_plato()==codigo)
            {


                sw = x;
                break;
            }
        }

        return sw;
    }

    public List<Platos> BuscarPlato(String nombre)
    {
        List<Platos> sw=new ArrayList<Platos>();

        for (Platos x: lista)
        {

            if (x.getNom_plato().equals(nombre))
            {

                sw.add(x);
            }
        }

        return sw;
    }
}
