package testescomjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class teste_calculo_ir {

	@Test
	void nivel1() {
		CalculoIR c = new CalculoIR();
		assertEquals(0, c.calcularAliquota(22847.76));
	}

	@Test
	void nivel2() {
		CalculoIR c = new CalculoIR();
		assertEquals(0.075, c.calcularAliquota(22847.77));
	}
	
	@Test
	void nivel3() {
		CalculoIR c = new CalculoIR();
		assertEquals(0.15, c.calcularAliquota(33919.81));
	}
	
	@Test
	void nivel4() {
		CalculoIR c = new CalculoIR();
		assertEquals(0.225, c.calcularAliquota(45012.61));
	}
	
	@Test
	void nivel5() {
		CalculoIR c = new CalculoIR();
		assertEquals(0.275, c.calcularAliquota(55976.17));
	}
	
}
