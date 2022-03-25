package idat.ortiz.jonathan.entidades;

public class Platos {
    private int cod_plato;
    private String nom_plato;
    private double precio_plato;

    public Platos() {
    }

    public int getCod_plato() {
        return cod_plato;
    }

    public void setCod_plato(int cod_plato) {
        this.cod_plato = cod_plato;
    }

    public String getNom_plato() {
        return nom_plato;
    }

    public void setNom_plato(String nom_plato) {
        this.nom_plato = nom_plato;
    }

    public double getPrecio_plato() {
        return precio_plato;
    }

    public void setPrecio_plato(double precio_plato) {
        this.precio_plato = precio_plato;
    }
}
