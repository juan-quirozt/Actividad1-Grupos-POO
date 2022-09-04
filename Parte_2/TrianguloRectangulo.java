public class TrianguloRectangulo {
	int base;
	int altura;
	
	public TrianguloRectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	double calcularArea() {
		return ( base*altura/2 );
	}
	
	double calcularPerimetro() {
		return (base + altura + calcularHipotenusa());
	}
	
	double calcularHipotenusa() {
		return Math.pow(base*base + altura*altura, 0.5);
	}
	
	
	void determinarTipoTriangulo() {
		if ( (base == altura) && (base == calcularHipotenusa())  && (altura == calcularHipotenusa()) ) {
			System.out.println("Es un tri�ngulo equilatero");
		}
		
		else if ( (base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()) ) {
			System.out.println("Es un tri�ngulo escaleno");
		}
		
		else {
			System.out.println("Es un tri�ngulo is�sceles");
		}
	}
		
}
