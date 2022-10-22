
package animales;

public class Lobo extends Canido {          //La clase Perro es una subclase de Canido
    
    public String getSonido() {             //Metodo que devuelve un String con el sonido de un lobo: "Aullido"     
        return "Aullido";                   //@return Un valor String con el sonido de un lobo: "Aullido"
    }
    
    public String getAlimentos() {          //Metodo que devuelve un String con los alimentos de un lobo
        return "Carnivoro";                 //@return Un valor String con la alimentacion de un lobo: "Carnivoro"
    }
    
    public String getHabitat() {            //Metodo que devuelve un String con el habitat de un lobo 
        return "Bosque";                    //@return Un valor String con el habitat de un lobo: "Bosque"
    }
    
    public String getNombreCientifico() {   //Metodo que devuelve un String con el nombre cientifico de un lobo 
        return "Canis lupus";               //@return Un valor String con el nombre cientifico de un lobo: "Canis lupus"
    }   
}
