
package Clase20241116;

/**
 *
 * @author Ever Chavez
 */
public class Laptop extends Producto{
    private String Pantalla;
    private String Teclado;

    public Laptop(String Pantalla, String Teclado, String Color, String Marca, String Modelo) {
        super(Color, Marca, Modelo);
        this.Pantalla = Pantalla;
        this.Teclado = Teclado;
    }

    public String getPantalla() {
        return Pantalla;
    }

    public void setPantalla(String Pantalla) {
        this.Pantalla = Pantalla;
    }

    public String getTeclado() {
        return Teclado;
    }

    public void setTeclado(String Teclado) {
        this.Teclado = Teclado;
    }
    
    
}
