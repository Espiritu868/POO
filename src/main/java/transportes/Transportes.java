
package transportes;

/**
 *
 * @author Ever Chavez
 */
public class Transportes {
    
    private String llantas; 
    private String motor; 
    private String volante;
    private String luces;
    private String color; 

    public Transportes(String llantas, String motor, String volante, String luces, String color) {
        this.llantas = llantas;
        this.motor = motor;
        this.volante = volante;
        this.luces = luces;
        this.color = color;

    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getVolante() {
        return volante;
    }

    public void setVolante(String volante) {
        this.volante = volante;
    }

    public String getLuces() {
        return luces;
    }

    public void setLuces(String luces) {
        this.luces = luces;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    


  
    
    
    
    
    
}
