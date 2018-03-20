/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/**
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
