package testescomjunit;

public class CalculoIR {

	public double calcularAliquota(double rendimentos) {
		
		if (rendimentos > 22847.76 && rendimentos <= 33919.80) {
			
			return 0.075;
			
		} else if (rendimentos > 33919.80 && rendimentos <= 45012.60) {
			
			return 0.15;
			
		} else if (rendimentos > 45012.60 && rendimentos <= 55976.16) {

			return 0.225;
			
		} else if (rendimentos > 45012.60) {
			
			return 0.275;
			
		} else {
			
			return 0;
			
		}
		
	}
	
}
