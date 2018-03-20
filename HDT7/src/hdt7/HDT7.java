/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/**
<<<<<<< HEAD
 * Main del programa
 * 
 * @author Paul Belches - 17088
 * @author Javier Anlue - 17149
 */
public class HDT7 {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		Diccionario diccionario = new Diccionario();
		Map<String, String> mapa = diccionario.coleccion(new TreeMap<String, String>(), diccionario.getRaiz());
		// Coleccion
		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			System.out.println("(" + entry.getKey() + "," + entry.getValue() + ")");
		}

		File f;
		FileReader fr;
		BufferedReader br;
		String text = "";
		try {
			f = new File("./texto.txt");
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String linea;
			while (br.ready()) {
				linea = br.readLine();
				text = text + linea;

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Se produjo un error:" + e);
		}
		text.toLowerCase();
		String[] words = text.split(" ");
		String translation = "";
		for (int i = 0; i < words.length; i++) {
			if (words[i].contains(".")) {
				String[] lastword = words[i].split(".");
				translation = translation + diccionario.Buscar(lastword[i], diccionario.getRaiz()) + ". ";
			} else {
				translation = translation + diccionario.Buscar(words[i], diccionario.getRaiz()) + " ";
			}
		}

		System.out.println(translation);

	}

}
=======
 * @Date 19/03/18
 * @author Javier Anleu
 * @author Paul Belches
 * 
 */
public class HDT7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();
        Map<String,String> mapa = diccionario.coleccion(new TreeMap<String,String>(), diccionario.getRaiz());
        //Coleccion
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            System.out.println("(" + entry.getKey() + "," + entry.getValue() + ")");
        }
        //Buscar
        System.out.println(diccionario.Buscar("Dog", diccionario.getRaiz()));
        System.out.println(diccionario.Buscar("yes", diccionario.getRaiz()));
        System.out.println(diccionario.Buscar("dog", diccionario.getRaiz()));
    }
    
}
>>>>>>> master
