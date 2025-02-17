package view;

import javax.swing.JOptionPane;

import controller.MultiplicaSRecursiva;

public class Principal {

	public static void main(String[] args) {
		MultiplicaSRecursiva multsrec = new MultiplicaSRecursiva ();
		int na = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número."));
		int nb = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número."));
		int contador = 1;
		JOptionPane.showMessageDialog(null, "A multiplicacao de " + na + " por " + nb + " é igual a " + multsrec.MultSRecursiva(na, nb, contador) + ".");
	}
}
