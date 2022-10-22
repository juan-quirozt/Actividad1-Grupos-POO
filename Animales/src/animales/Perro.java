
package animales;

public class Perro extends Canido {         //La clase Perro es una subclase de Canido
    
    public String getSonido() {             //Metodo que devuelve un String con el sonido de un perro
        return "Ladrido";                   //@return Un valor String con el sonido de un perro: "Ladrido"
    }
    
    public String getAlimentos() {          //Metodo que devuelve un String con los alimentos de un perro
        return "Carnivoro";                 //@return Un valor String con la alimentacion de un perro: "Carnivoro"
    }
    
    public String getHabitat() {            //Metodo que devuelve un String con el habitat de un perro 
        return "Domestico";                 //@return Un valor String con el habitat de un perro: "Domestico"
    }
    
    public String getNombreCientifico() {   //Metodo que devuelve un String con el nombre cientifico de un perro 
        return "Canis lupus familiaris";    //@return Un valor String con el nombre cientifico de un perro: "Canis Lupus familiaris"
    }
}
