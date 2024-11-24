
package Cajero;

/**
 *
 * @author chave
 */
public class Banco extends Cajero{
    
    private String numeroFila; 
    private String idCliente;

    public Banco(String numeroFila, String idCliente, String tipoTarjeta, String nombreUsuario, String codigo) {
        super(tipoTarjeta, nombreUsuario, codigo);
        this.numeroFila = numeroFila;
        this.idCliente = idCliente;
    }

    public String getNumeroFila() {
        return numeroFila;
    }

    public void setNumeroFila(String numeroFila) {
        this.numeroFila = numeroFila;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    
    
}
