
package animales;

public class Gato extends Felino {
    
    public String getSonido() {             //Metodo que devuelve un String con el sonido de un gato    
        return "Maullido";                  //@return Un valor String con el sonido de un gato: "Maullido"
    }
    
    public String getAlimentos() {          //Metodo que devuelve un String con los alimentos de un gato
        return "Ratones";                   //@return Un valor String con la alimentacion de un gato: "Ratones"
    }
    
    public String getHabitat() {            //Metodo que devuelve un String con el habitat de un gato 
        return "Domestico";                  //@return Un valor String con el habitat de un gato: "Domestico"
    }
    
    public String getNombreCientifico() {   //Metodo que devuelve un String con el nombre cientifico de un gato 
        return "Felis silvestris catus";              //@return Un valor String con el nombre cientifico de un gato: "Felis silvestris catus"
    }       
}
