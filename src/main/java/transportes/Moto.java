
package transportes;

/**
 *
 * @author chave
 */
public class Moto extends Transportes{
    
    
    private String cilindraje; 

    public Moto(String cilindraje, String llantas, String motor, String volante, String luces, String color) {
        super(llantas, motor, volante, luces, color);
        this.cilindraje = cilindraje;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    
    
    



    
    
    
    
}
