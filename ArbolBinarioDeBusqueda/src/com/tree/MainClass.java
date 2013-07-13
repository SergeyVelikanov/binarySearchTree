package com.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * run application with input menu (BufferedReader) 
 */
public class MainClass {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		// let's Construct the tree(max 9 int numbers)
		Arbol arbol = new Arbol();
		int b, cont = 0;
		Object obj;
		System.out
				.println("Input  9 int numbers one-by-one to construct the tree");
		while (cont < 9) {
			try {
				b = Integer.parseInt(bufferedReader.readLine());
				arbol.insertaNodo(b);
				cont++;
			} catch (NumberFormatException e) {
				System.out.println("Wrong input");
			}
		}
		System.out.print("Recursive pre-order traversal of the tree: ");
		arbol.preorden(arbol.getRaiz());
		System.out.println();
		System.out.print("Recursive in-order traversal of the tree: ");
		arbol.inOrden(arbol.getRaiz());
		System.out.println();
		System.out.print("Recursive post-order traversal of the tree: ");
		arbol.postOrden(arbol.getRaiz());
		System.out.println("\n");
		System.out
				.println("Input the value to search o write \"exit\"(whitout quotes) to quit ");
		while (true) {
			try {
				obj = bufferedReader.readLine();
				if (obj.equals("exit")) {
					System.out.println("Finished");
					System.exit(0);
				} else {
					b = Integer.parseInt((String) obj);
					arbol.buscarValor(arbol.getRaiz(), b);
				}

			} catch (NullPointerException e) {
				System.out.println("Value not found ");

			} catch (NumberFormatException e) {
				// Nothing to do
			}
		}

	}
}
