package org.mvpigs.pulpo;

import java.util.Collection;
import java.util.Set;

public class Registro {
	Collection<String> eventos;
	private boolean pulpo;
	
public Registro(Collection<String> eventos, boolean pulpo) {
		this.pulpo=pulpo;
		this.eventos=eventos;
	}
public boolean contieneEvento( String evento, Collection<String> eventos) {
	int suma = 0;
	for ( String esta : eventos) 
		if (esta == evento)  {
			suma=suma+1;
		}else
			suma=suma;
	if (suma > 0) {
		return true;
	}else {
		return false;
	}
	}
public void mostrarRegistro() {
	System.out.println(this.eventos);
	System.out.println(this.pulpo);
}
	
}
