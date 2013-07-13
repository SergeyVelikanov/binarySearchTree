package com.tree;

class NodoBinario {
	private int dato;
	private NodoBinario izq;
	private NodoBinario der;

	NodoBinario(int e) {
		dato = e;
	}

	// insert nodes(right and left)
	public void insertaBinario(int e) {
		if (e < dato) {
			if (izq == null)
				izq = new NodoBinario(e);
			else
				izq.insertaBinario(e);
		} else {
			if (e > dato) {
				if (der == null)
					der = new NodoBinario(e);
				else
					der.insertaBinario(e);
			}
		}
	}
	
	// Getters and Setters =============================================================

	/**
	 * @return the dato
	 */
	public int getDato() {
		return dato;
	}

	/**
	 * @param dato the dato to set
	 */
	public void setDato(int dato) {
		this.dato = dato;
	}

	/**
	 * @return the izq
	 */
	public NodoBinario getIzq() {
		return izq;
	}

	/**
	 * @param izq the izq to set
	 */
	public void setIzq(NodoBinario izq) {
		this.izq = izq;
	}

	/**
	 * @return the der
	 */
	public NodoBinario getDer() {
		return der;
	}

	/**
	 * @param der the der to set
	 */
	public void setDer(NodoBinario der) {
		this.der = der;
	}
}
