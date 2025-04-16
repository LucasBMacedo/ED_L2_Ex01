package view;

import javax.swing.JOptionPane;

import controller.MultiplicaSRecursiva;

public class Principal {

	public static void main(String[] args) {
		MultiplicaSRecursiva multsrec = new MultiplicaSRecursiva ();
		int na = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número inteiro positivo."));
		int nb = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número inteiro positivo."));
		int contador = 0;
		JOptionPane.showMessageDialog(null, "A multiplicacao de " + na + " por " + nb + " é igual a " + multsrec.MultSRecursiva(na, nb, contador) + ".");
	}
}
