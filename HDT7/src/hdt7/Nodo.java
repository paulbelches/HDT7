/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

import java.util.regex.Pattern;

/**
<<<<<<< HEAD
 * Nodo
 * 
 * @author Paul Belches 17088
 * @author Javier Anleu 17149
 *
 *
 */
public class Nodo<E> {

	private Nodo<E> izquierda;
	private Nodo<E> derecha;
	private Association<String, String> valor;

	public Nodo(String valor) {
		String sep = Pattern.quote(",");
		String[] partes = valor.split(sep);
		this.izquierda = null;
		this.derecha = null;
		this.valor = new Association(partes[0], partes[1]);
	}

	public Nodo<E> getIzquierda() {
		return izquierda;
	}

	public void setIzquierda(Nodo<E> izquierda) {
		this.izquierda = izquierda;
	}

	public Nodo<E> getDerecha() {
		return derecha;
	}

	public void setDerecha(Nodo<E> derecha) {
		this.derecha = derecha;
	}

	public Association getValor() {
		return valor;
	}

	public void setValor(Association valor) {
		this.valor = valor;
	}
=======
 * @Date 19/03/18
 * @author Javier Anleu
 * @author Paul Belches
 * 
 * @param <E>
 */
public class Nodo<E> {

    private Nodo<E> izquierda;
    private Nodo<E> derecha;
    private Association<String,String> valor;

    /**
     *
     * @param valor
     */
    public Nodo(String valor) {
        String sep = Pattern.quote(",");
        String[] partes = valor.split(sep);
        this.izquierda = null;
        this.derecha = null;
        this.valor = new Association(partes[0], partes[1]);
    }

    /**
     *
     * @return
     */
    public Nodo<E> getIzquierda() {
        return izquierda;
    }

    /**
     *
     * @param izquierda
     */
    public void setIzquierda(Nodo<E> izquierda) {
        this.izquierda = izquierda;
    }

    /**
     *
     * @return
     */
    public Nodo<E> getDerecha() {
        return derecha;
    }

    /**
     *
     * @param derecha
     */
    public void setDerecha(Nodo<E> derecha) {
        this.derecha = derecha;
    }

    /**
     *
     * @return
     */
    public Association  getValor() {
        return valor;
    }

    /**
     *
     * @param valor
     */
    public void setValor(Association  valor) {
        this.valor = valor;
    }
>>>>>>> master

}
