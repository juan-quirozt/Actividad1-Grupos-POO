
public class Trapecio {
	int base_menor;
	int base_mayor;
	int altura;
	int lado1;
	int lado2;
	
	Trapecio(int base_menor, int base_mayor, int altura, int lado1, int lado2) {
		this.base_menor = base_menor;
		this.base_mayor = base_mayor;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}
	
	double calcularArea() {
		return ( (base_menor + base_mayor)/2 ) * altura;
	}
	
	double calcularPerimetro() {
		return base_menor + base_mayor + lado1 + lado2 ;
	}
}

