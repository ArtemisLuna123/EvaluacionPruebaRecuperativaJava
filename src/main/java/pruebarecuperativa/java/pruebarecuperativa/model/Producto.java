package pruebarecuperativa.java.pruebarecuperativa.model;

public class Producto {
    //*● El minimarket cuenta con tipos de productos y productos entre otros objetos
    //Atributos
    public String nombre;
    public Double precioUnit;
    public int cantStock;
    public boolean disponible = false;

    public Producto() {
    }


    public Producto(String nombre, Double precioUnit, int cantStock, boolean disponible) {
        this.nombre = nombre;
        this.precioUnit = precioUnit;
        this.cantStock = cantStock;
        this.disponible = disponible;
    }




    public String getNombre() {
        return nombre;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public Double getPrecioUnit() {
        return precioUnit;
    }




    public void setPrecioUnit(Double precioUnit) {
        this.precioUnit = precioUnit;
    }




    public int getCantStock() {
        return cantStock;
    }




    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }




    public boolean isDisponible() {
        return disponible;
    }




    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }




    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precioUnit=" + precioUnit + ", cantStock=" + cantStock
                + ", disponible=" + disponible + "]";
    }


    public static void add(Tipo tipo) {
    }

    

    

    

}
