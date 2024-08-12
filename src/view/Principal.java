package view;

import controller.VetorNegativoController;

public class Principal {

	public static void main(String[] args) {
		VetorNegativoController vetorNegativoController = new VetorNegativoController();
		int[] vetor = {4, -10, 9, -8, -18};
		int i = 0;
		int totalNumeroNegativo = vetorNegativoController.contarNumeroNegativo(vetor, i);
		
		System.out.println("O total de números negativos no vetor é: " + totalNumeroNegativo);
	}
}
