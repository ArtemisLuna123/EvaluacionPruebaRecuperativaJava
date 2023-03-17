package pruebarecuperativa.java.pruebarecuperativa.model;

public class Tipo  extends Producto{
      //Atributo
      public String categoria;
      
      public Tipo() {
        super();
    }

    public Tipo(String categoria) {
        this.categoria = categoria;
    }

    public Tipo(String nombre, Double precioUnit, int cantStock, boolean disponible, String categoria) {
        super(nombre, precioUnit, cantStock, disponible);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Tipo [categoria=" + categoria + "]";
    }

    
    

    

    
    
}
