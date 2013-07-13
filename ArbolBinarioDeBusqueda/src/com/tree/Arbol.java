package com.tree;

class Arbol {
	private Cola cola = new Cola();
	private NodoBinario padre;
	private NodoBinario raiz;
	
	public Arbol() {
		raiz = null;
	}

	// Insert one element to the tree
	public void insertaNodo(int e) {
		if (raiz == null)
			raiz = new NodoBinario(e);
		else
			raiz.insertaBinario(e);
	}

	// Recursive pre-order traversal of the tree
	public void preorden(NodoBinario nodo) {
		if (nodo == null)
			return;
		else {
			System.out.print(nodo.getDato() + " ");
			preorden(nodo.getIzq());
			preorden(nodo.getDer());
		}
	}

	// Recursive post-order traversal of the tree
	public void postOrden(NodoBinario nodo) {
		if (nodo == null)
			return;
		else {
			postOrden(nodo.getIzq());
			postOrden(nodo.getDer());
			System.out.print(nodo.getDato() + " ");
		}
	}

	// Recursive in-order traversal of the tree
	public void inOrden(NodoBinario nodo) {
		if (nodo == null)
			return;
		else {
			inOrden(nodo.getIzq());
			System.out.print(nodo.getDato() + " ");
			inOrden(nodo.getDer());
		}
	}

	// Search for the element in the tree
	void buscarValor(NodoBinario raiz, int e) {
		if ((raiz == null) | (raiz.getDato() == e)) {
			System.out.print("Value found(" + raiz.getDato() + ")" + "\n");
			return;
		} else {
			if (e > raiz.getDato())
				buscarValor(raiz.getDer(), e);
			else
				buscarValor(raiz.getIzq(), e);
		}
	}
	
	// Getters and Setters =========================================================

	/**
	 * @return the cola
	 */
	public Cola getCola() {
		return cola;
	}

	/**
	 * @param cola the cola to set
	 */
	public void setCola(Cola cola) {
		this.cola = cola;
	}

	/**
	 * @return the padre
	 */
	public NodoBinario getPadre() {
		return padre;
	}

	/**
	 * @param padre the padre to set
	 */
	public void setPadre(NodoBinario padre) {
		this.padre = padre;
	}

	/**
	 * @return the raiz
	 */
	public NodoBinario getRaiz() {
		return raiz;
	}

	/**
	 * @param raiz the raiz to set
	 */
	public void setRaiz(NodoBinario raiz) {
		this.raiz = raiz;
	}	

}
