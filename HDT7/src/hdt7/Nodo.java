/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

/**
 *
 * @author paulb
 */
public class Nodo<E> {

    private Nodo<E> padre;
    private Nodo<E> izquierda;
    private Nodo<E> derecha;
    private E valor;

    public Nodo(Nodo<E> padre, E valor) {
        this.padre = padre;
        this.izquierda = null;
        this.derecha = null;
        this.valor = valor;
    }

    public Nodo<E> getPadre() {
        return padre;
    }

    public void setPadre(Nodo<E> padre) {
        this.padre = padre;
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

    public E getValor() {
        return valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

}
