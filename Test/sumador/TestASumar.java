package sumador;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Mikel
 *
 */
public class TestASumar {
/**
 * Si el resultado es = 5 sera verdadera
 */
	@Test
	public void testUnaCifra() {
		ASumar sumi = new ASumar("5");
		String resultado = sumi.mostrar();
		assertEquals("5=5",resultado);
	}
}