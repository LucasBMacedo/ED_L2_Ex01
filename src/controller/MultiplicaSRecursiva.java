package controller;

public class MultiplicaSRecursiva {

	public MultiplicaSRecursiva() {
		super ();
	}
	
	public int MultSRecursiva (int na, int nb, int contador) {
		if (nb == 0 || na == 0 || contador == nb) {
			return 0;
		}
		return na + MultSRecursiva (na, nb, contador + 1);
	}
}