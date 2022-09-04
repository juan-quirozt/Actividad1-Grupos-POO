public class PruebaFiguras {
	public static void main(String[] args) {
		
		Circulo figura1 = new Circulo(2);
		Rectangulo figura2 = new Rectangulo(1,2);
		Cuadrado figura3 = new Cuadrado(3);
		TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
		Rombo figura5 = new Rombo(4,10);
		Trapecio figura6 = new Trapecio(2,3,4,5,6);
		
		System.out.println("El �rea del c�rculo es: " + figura1.calcularArea());
		System.out.println("El per�metro del c�rculo es: " + figura1.calcularPerimetro());
		System.out.println();
		System.out.println("El �rea del rect�ngulo es: " + figura2.calcularArea());
		System.out.println("El per�metro del rect�ngulo es: " + figura2.calcularPerimetro());		
		System.out.println();
		System.out.println("El �rea del cuadrado es: " + figura3.calcularArea());
		System.out.println("El per�metro del cuadrado es: " + figura3.calcularPerimetro());		
		System.out.println();
		System.out.println("El �rea del tri�ngulo es: " + figura4.calcularArea());
		System.out.println("El per�metro del tri�ngulo es: " + figura4.calcularPerimetro());
		figura4.determinarTipoTriangulo();
		System.out.println();
		
		System.out.println("El �rea del rombo es: " + figura5.calcularArea());              
		System.out.println("El per�metro del rombo es: " + figura5.calcularPerimetro());		
		System.out.println();
		System.out.println("El �rea del trapecio es: " + figura6.calcularArea());			
		System.out.println("El per�metro del trapecio es: " + figura6.calcularPerimetro());	
		
	}	
}
