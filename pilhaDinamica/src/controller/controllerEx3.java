package controller;

import br.edu.fateczl.pilha.PilhaInt;

public class controllerEx3 {

	public controllerEx3() {
		super();
	}
	
	public long fatorial(int v) {
		PilhaInt p = new PilhaInt();
		for (int i = 1; i <= v; i++) {
			p.push(i);
		}
		
		long resul = 1;
		
		while (!p.isEmpty()) {
			try {
				resul *= p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resul;
	}

}
