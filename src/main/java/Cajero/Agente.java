
package Cajero;

/**
 *
 * @author chave
 */
public class Agente extends Cajero{
    
    private String nombreTienda; 
    private String cantidadRetiro; 

    public Agente(String nombreTienda, String cantidadRetiro, String tipoTarjeta, String nombreUsuario, String codigo) {
        super(tipoTarjeta, nombreUsuario, codigo);
        this.nombreTienda = nombreTienda;
        this.cantidadRetiro = cantidadRetiro;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getCantidadRetiro() {
        return cantidadRetiro;
    }

    public void setCantidadRetiro(String cantidadRetiro) {
        this.cantidadRetiro = cantidadRetiro;
    }
    
    
}
