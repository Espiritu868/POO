
package transportes;

/**
 *
 * @author chave
 */
public class Avion extends Transportes{
    
    private String numeroTurbinas; 

    public Avion(String numeroTurbinas, String llantas, String motor, String volante, String luces, String color) {
        super(llantas, motor, volante, luces, color);
        this.numeroTurbinas = numeroTurbinas;
    }

    public String getNumeroTurbinas() {
        return numeroTurbinas;
    }

    public void setNumeroTurbinas(String numeroTurbinas) {
        this.numeroTurbinas = numeroTurbinas;
    }
    
    
    
}