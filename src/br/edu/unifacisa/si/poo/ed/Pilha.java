package br.edu.unifacisa.si.poo.ed;

public class Pilha {

	public static final int TAM_INICIAL = 3;

	private Object[] arrayInterno = new Object[TAM_INICIAL];

	private int inseridos;

	public void push(Object objeto) {

		if (inseridos == arrayInterno.length) {

			Object[] novoArray = new Object[arrayInterno.length * 2];

			for (int i = 0; i < arrayInterno.length; i++) {
				novoArray[i] = arrayInterno[i];
			}

			arrayInterno = novoArray;
		}

		arrayInterno[inseridos] = objeto;
		inseridos++;
	}

	public Object pop() {

		Object retorno = top();
		arrayInterno[inseridos - 1] = null;
		inseridos--;

		return retorno;
	}

	public Object top() {
		return arrayInterno[inseridos - 1];
	}

	public int tamanho() {
		return inseridos;
	}

}
