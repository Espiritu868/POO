
package Cajero;

/**
 *
 * @author chave
 */
public class CajeroAutomatico extends Cajero {
    
    private String cantidadRetiro; 
    private String ubicacionCajero; 

    public CajeroAutomatico(String cantidadRetiro, String ubicacionCajero, String tipoTarjeta, String nombreUsuario, String codigo) {
        super(tipoTarjeta, nombreUsuario, codigo);
        this.cantidadRetiro = cantidadRetiro;
        this.ubicacionCajero = ubicacionCajero;
    }

    public String getCantidadRetiro() {
        return cantidadRetiro;
    }

    public void setCantidadRetiro(String cantidadRetiro) {
        this.cantidadRetiro = cantidadRetiro;
    }

    public String getUbicacionCajero() {
        return ubicacionCajero;
    }

    public void setUbicacionCajero(String ubicacionCajero) {
        this.ubicacionCajero = ubicacionCajero;
    }
    
    
}
