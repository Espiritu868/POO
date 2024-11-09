/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package POO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chave
 */
public class Herencia {

    public static void main(String[] args) {
        
        Perro p = new Perro("Color Negro", "Si", "Si", "Si", 4);
        
        //p.Sonido();
        
        Gato g = new Gato("Color Amarillo", "Si", "Si", "Si", 4);
        
        //g.Sonido();
 
        Qeco q = new Qeco("Es pelon", "Si", "Si", "Si", 4);
        
        //q.Sonido();
        
        List<NewClass> lista = new ArrayList<NewClass>();
        lista.add(p);
        lista.add(g);
        lista.add(new Qeco("No", "Si", "Si", "Si", 4));
    
        for (NewClass item : lista){
            
            item.Sonido();
        }
    }   
        
}


