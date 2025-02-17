package controller;

public class MultiplicaSRecursiva {

	public MultiplicaSRecursiva() {
		super ();
	}
	
	public int MultSRecursiva (int na, int nb, int contador) {
		if (contador == nb) {
			return na;
		}
		if (contador < nb) {
			
		}
		return na + MultSRecursiva (na, nb, contador + 1);
	}
}