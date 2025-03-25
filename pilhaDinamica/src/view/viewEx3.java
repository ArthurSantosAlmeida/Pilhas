package view;

import javax.swing.JOptionPane;
import controller.controllerEx3;

public class viewEx3 {

	public static void main(String[] args) {
		controllerEx3 c = new controllerEx3();
		int v=11;
		long resul;
		
		while (v > 10 || v < 0) {
			v = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 a 10"));
		}
		
		resul = c.fatorial(v);
		System.out.println(resul);
	}

}
