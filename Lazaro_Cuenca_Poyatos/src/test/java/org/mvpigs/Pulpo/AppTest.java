package org.mvpigs.pulpo;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest {
	 @Test
		public void test_mostrar() {

	        Registro pedidoInt = new Registro(("Mordor", "rhagar"), false);
	        assertEquals("Mordor", pedidoInt.destino());

			TratamientoPedido tratamientoKO = new TratamientoPedidoInternacional(
	                                                    (PedidoInternacional) pedidoInt);
	        assertNotNull(tratamientoKO);
	        assertFalse(tratamientoKO.tratar());			
		}
}
