/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Pattern;

/**
<<<<<<< HEAD
 * Diccionario
 * 
 * @author Paul Belches 17088
 * @author Javier Anleu 17149
=======
 * @Date 19/03/18
 * @author Javier Anleu
 * @author Paul Belches
 * 
>>>>>>> master
 */
public class Diccionario {
	private Nodo raiz;

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	public Diccionario() {
		raiz = llenar("./diccionario.txt");
	}

	public Nodo<String> insertar(String valor, Nodo<Association<String, String>> nodo) {
		if (nodo == null) {
			nodo = new Nodo<Association<String, String>>(valor);
		} else {
			String sep = Pattern.quote(",");
			String[] partes2 = valor.split(sep);
			String s = nodo.getValor().key.toString();
			// Revisar si el valor es mayor
			if (s.compareTo(partes2[0]) < 0) {
				nodo.setDerecha(insertar(valor, nodo.getDerecha()));
			} else {
				nodo.setIzquierda(insertar(valor, nodo.getIzquierda()));
			}
		}
		return nodo;
	}

	public String Buscar(String palabra, Nodo nodo) {
		String s = nodo.getValor().key.toString();
		if (s.compareTo(palabra) == 0) {
			return nodo.getValor().value.toString();
		} else {
			if ((s.compareTo(palabra) < 0) && (nodo.getDerecha() != null)) {
				return Buscar(palabra, nodo.getDerecha());
			} else if (nodo.getIzquierda() != null) {
				return Buscar(palabra, nodo.getIzquierda());
			} else
				return "*" + palabra + "*";
		}
	}

<<<<<<< HEAD
	public Map<String, String> coleccion(Map<String, String> mapa, Nodo<String> nodo) {
		if (nodo.getIzquierda() != null)
			mapa = coleccion(mapa, nodo.getIzquierda());
		mapa.put(nodo.getValor().getKey().toString(), nodo.getValor().getValue().toString());
		if (nodo.getDerecha() != null)
			mapa = coleccion(mapa, nodo.getDerecha());
		return mapa;
	}

	public Nodo llenar(String cadena) {
		File f;
		FileReader fr;
		BufferedReader br;
		Nodo nodo = null;
		try {

			f = new File(cadena);
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String linea;
=======
    /**
     *
     * @return
     */
    public Nodo getRaiz() {
        return raiz;
    }

    /**
     *
     * @param raiz
     */
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
   
    /**
     *
     */
    public Diccionario(){
       raiz = llenar("./diccionario.txt");
   }

    /**
     *Método para insetar
     * @param valor
     * @param nodo
     * @return
     */
    public Nodo insertar(String valor, Nodo nodo){
       if (nodo == null){
           nodo = new Nodo(valor);
       } else {
            String sep = Pattern.quote(",");
            String[] partes2 = valor.split(sep);
            String s = nodo.getValor().key.toString();
           //Revisar si el valor es mayor
           if (s.compareTo(partes2[0]) < 0) {
               nodo.setDerecha(insertar(valor,nodo.getDerecha()));
           } else {
               nodo.setIzquierda(insertar(valor,nodo.getIzquierda()));
           }
       }
       return nodo;
   }
   
    /**Método para buscar
     *
     * @param palabra
     * @param nodo
     * @return
     */
    public String Buscar(String palabra,Nodo nodo){
       String s = nodo.getValor().key.toString();
       if (s.compareTo(palabra) == 0) {
           return nodo.getValor().value.toString();
       } else {
          if ((s.compareTo(palabra) < 0) && (nodo.getDerecha() != null)) {
            return  Buscar(palabra,nodo.getDerecha());
          } else if (nodo.getIzquierda() != null) {
            return  Buscar(palabra,nodo.getIzquierda());
          } else return "*"+palabra+"*";
       }
   }

    /**Método que devuelve la colecion 
     *
     * @param mapa
     * @param nodo
     * @return
     */
    public Map<String,String> coleccion(Map<String,String> mapa,Nodo<String> nodo){
       if (nodo.getIzquierda() != null) mapa = coleccion(mapa,nodo.getIzquierda());
       mapa.put(nodo.getValor().getKey().toString(),nodo.getValor().getValue().toString());
       if (nodo.getDerecha() != null) mapa = coleccion(mapa,nodo.getDerecha());
       return mapa;
   }

    /**Método para llenar el mapa
     *
     * @param cadena
     * @return
     */
    public Nodo llenar(String cadena) {
        File f;
        FileReader fr;
        BufferedReader br;
        Nodo nodo = null;
        try {
>>>>>>> master

			while ((linea = br.readLine()) != null) {
				;
				linea = linea.substring(linea.indexOf('(') + 1, linea.indexOf(')'));
				nodo = insertar(linea, nodo);
			}
			br.close();
			fr.close();

		}
		// Si el archivo se modifica manualmente o sucede cualquier otros tipo de
		// error, este sera comunicado con el usuario
		catch (Exception e) {

			System.err.println("Se produjo un error:" + e);

		}
		return nodo;
	}

}
