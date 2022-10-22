
package animales;

public class Leon extends Felino{
    
    public String getSonido() {             //Metodo que devuelve un String con el sonido de un leon    
        return "Rugido";                    //@return Un valor String con el sonido de un leon: "Rugido"
    }
    
    public String getAlimentos() {          //Metodo que devuelve un String con los alimentos de un leon
        return "Carnivoro";                 //@return Un valor String con la alimentacion de un leon: "Carnivoro"
    }
    
    public String getHabitat() {            //Metodo que devuelve un String con el habitat de un leon 
        return "Praderas";                  //@return Un valor String con el habitat de un leon: "Praderas"
    }
    
    public String getNombreCientifico() {   //Metodo que devuelve un String con el nombre cientifico de un leon 
        return "Panthera leo";              //@return Un valor String con el nombre cientifico de un leon: "Panthera leo"
    }     
}
