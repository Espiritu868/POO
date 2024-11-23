
package POO;



public class Gato extends NewClass {

    public Gato(String Pelo, String Boca, String Cola, String Ojo, Integer Patas) {
        super(Pelo, Boca, Cola, Ojo, Patas);
    }
    
    @Override
    public void Sonido () {
    
        System.out.println("El gato Maulla");
    }
    

}
