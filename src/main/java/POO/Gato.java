/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author chave
 */

public class Gato extends NewClass {

    public Gato(String Pelo, String Boca, String Cola, String Ojo, Integer Patas) {
        super(Pelo, Boca, Cola, Ojo, Patas);
    }
    
    @Override
    public void Sonido () {
    
        System.out.println("El gato Maulla");
    }
    

}
