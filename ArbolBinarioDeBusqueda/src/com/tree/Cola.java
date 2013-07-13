package com.tree;

class Cola {
	private NodosListaA primerNodo;
	private NodosListaA ultimoNodo;
	private String nombre;

	// Empty list with the name "Lista"
	public Cola() {
		this("Lista");
	}
	
	public Cola(String s) {
		nombre = s;
		primerNodo = ultimoNodo = null;
	}
	
	// Getters and Setters ==========================================================

	/**
	 * @return the primerNodo
	 */
	public NodosListaA getPrimerNodo() {
		return primerNodo;
	}

	/**
	 * @param primerNodo the primerNodo to set
	 */
	public void setPrimerNodo(NodosListaA primerNodo) {
		this.primerNodo = primerNodo;
	}

	/**
	 * @return the ultimoNodo
	 */
	public NodosListaA getUltimoNodo() {
		return ultimoNodo;
	}

	/**
	 * @param ultimoNodo the ultimoNodo to set
	 */
	public void setUltimoNodo(NodosListaA ultimoNodo) {
		this.ultimoNodo = ultimoNodo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
