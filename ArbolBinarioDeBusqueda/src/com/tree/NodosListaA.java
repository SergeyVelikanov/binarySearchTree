package com.tree;

class NodosListaA {
	private NodoBinario datos;
	private NodosListaA siguiente;
	
	NodosListaA(NodoBinario valor) {
		datos = valor;
		siguiente = null; 
	}
	
	NodosListaA(NodoBinario valor, NodosListaA sigNodo) {
		datos = valor;
		siguiente = sigNodo; // next node
	}
	
	// Getters and Setters =============================================================

	/**
	 * @return the datos
	 */
	public NodoBinario getDatos() {
		return datos;
	}

	/**
	 * @param datos the datos to set
	 */
	public void setDatos(NodoBinario datos) {
		this.datos = datos;
	}

	/**
	 * @return the siguiente
	 */
	public NodosListaA getSiguiente() {
		return siguiente;
	}

	/**
	 * @param siguiente the siguiente to set
	 */
	public void setSiguiente(NodosListaA siguiente) {
		this.siguiente = siguiente;
	}
}
