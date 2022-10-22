
package animales;

public class Prueba {           //Esta clase prueba diferentes animales y sus metodos
    /**
     * Metodo main que crea unu array de varios animales y para cada uno
     * muestra en pantalla su nombre cientifico, su sonido, alimentos y
     * habitat
     */

    public static void main(String[] args) {
        
        Animal[] animales = new Animal[4];      //Define un array de cuadro elementos de tipo Animal
        
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
        
        for (int i=0; i < animales.length; i++) {
            System.out.println(animales[i].getNombreCientifico());
            System.out.println("Sonido: " + animales[i].getSonido());
            System.out.println("Alimentos: " + animales[i].getAlimentos());
            System.out.println("Habitat: " + animales[i].getHabitat());
            System.out.println();
        }
    }    
}
