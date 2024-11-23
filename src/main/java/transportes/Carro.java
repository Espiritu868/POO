
package transportes;


public class Carro extends Transportes{
    
    private String direccion; 

    public Carro(String direccion, String llantas, String motor, String volante, String luces, String color) {
        super(llantas, motor, volante, luces, color);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
    
    
}
