package br.com.senaitagua.sa01.app7;
import javax.swing.JOptionPane;

import br.com.senaitagua.sa01.bo.SomaPecasBO;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resp1 = JOptionPane.showInputDialog("Informe o valor da primeira peça:");
		String resp2 = JOptionPane.showInputDialog("Informe o valor da segunda peça:");
		String resp3 = JOptionPane.showInputDialog("Informe o valor da terceira peça:");
		String resp4 = JOptionPane.showInputDialog("Informe o valor da quarta peça:");
		String resp5 = JOptionPane.showInputDialog("Informe o valor da quinta peça:");
		
		double pec1 = Double.parseDouble(resp1);
		double pec2 = Double.parseDouble(resp2);
		double pec3 = Double.parseDouble(resp3);
		double pec4 = Double.parseDouble(resp4);
		double pec5 = Double.parseDouble(resp5);
		
		SomaPecasBO sbo = new SomaPecasBO();
		
		JOptionPane.showMessageDialog(null,"A soma total de todas as peças sera de R$ " + sbo.somaTotal(pec1, pec2, pec3, pec4, pec5));
	}

}
