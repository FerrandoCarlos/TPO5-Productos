
package modelo;

/**
 * @author Ferrando Carlos
 */
public class Producto {
    //Atributos
    private String categoria;
    private String nombre;
    private double precio;
    //Constructor
    public Producto(String categoria, String nombre, double precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String categoria) {
        this.categoria = categoria;
    }
    
    //Getters and Seters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //toString

    @Override
    public String toString() {
        return  categoria ;
    }
       
}
