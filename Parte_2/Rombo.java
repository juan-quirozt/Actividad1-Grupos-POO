public class Rombo {
	int diagonal_sup;
	int diagonal_inf;
	
	Rombo(int diagonal_sup, int diagonal_inf) {
		this.diagonal_sup = diagonal_sup;
		this.diagonal_inf = diagonal_inf;
	}
	
	double calcularArea() {
		return (diagonal_sup * diagonal_inf)/2;
	}
	
	double calcularPerimetro() {
		
		return 4*Math.pow((diagonal_sup*diagonal_sup)/4 + (diagonal_inf*diagonal_inf)/4, 0.5);
	}
}

		