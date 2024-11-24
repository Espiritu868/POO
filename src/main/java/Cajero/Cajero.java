
package Cajero;

/**
 *
 * @author chave
 */
public class Cajero {
    
    private String tipoTarjeta; 
    private String nombreUsuario; 
    private String codigo; 

    public Cajero(String tipoTarjeta, String nombreUsuario, String codigo) {
        this.tipoTarjeta = tipoTarjeta;
        this.nombreUsuario = nombreUsuario;
        this.codigo = codigo;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
