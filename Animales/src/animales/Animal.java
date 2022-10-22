package animales;

/**
 *
 * @author esteb
 */
public abstract class Animal {      //Clase abstracta Animal para modelar un animal genérico.
    protected String sonido;        //Atributo para el sonido del animal
    protected String alimentos;     //Atributos para los alimentos que consume el animal
    protected String habitat;       //Atributo para el habitat del animal
    protected String nombreCientifico;      //Atributo para el nombre cientifico del animal
    
    public abstract String getNombreCientifico();       //Metodo abstracto que permite obtener el nombre cientifico del animal    
    public abstract String getSonido();                 //Metodo abstracto que permite obtener el sonido producido por el animal
    public abstract String getAlimentos();              //Metodo abstracto que permite obtener los alimentos que consume un animal 
    public abstract String getHabitat();                //Metodo abstracto que permite obtener el habitat del animal
}


