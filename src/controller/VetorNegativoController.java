package controller;

public class VetorNegativoController {

	public VetorNegativoController() {
		super();
	}
	
	public int contarNumeroNegativo(int[] vetor, int i) {
		// Condição de parada: quando o i for igual ao tamanho do vetor, significa que o vetor foi percorrido
		if(i == vetor.length) {
			return 0;
		} else {
		// Relação de chamada dos passos:
	    // Se o número atual for negativo, soma 1 e chama a função para a próxima posição
			int cta = 0;
			
			if(vetor[i] < 0) {
				cta += 1;
			}
			
			return cta + contarNumeroNegativo(vetor, i + 1);
		}
	}
}
