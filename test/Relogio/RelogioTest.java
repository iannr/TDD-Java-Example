package Relogio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RelogioTest {

	@Test
	void verificarHora() {
		Relogio relogio = new Relogio ();
		relogio.setHoras(1);
		//verificar se a hora esta igual a informada
		assertEquals(1, relogio.getHoras());
		
		
		 
	}

}
