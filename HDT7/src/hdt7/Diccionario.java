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
 *
 * @author paulb
 */
public class Diccionario {
   private Nodo<String> raiz  ;

    public Nodo<String> getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo<String> raiz) {
        this.raiz = raiz;
    }
   
   public Diccionario(){
       raiz = llenar("./diccionario.txt");
   }
   public Nodo insertar(String valor, Nodo<String> nodo){
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
   
   public String Buscar(String palabra){
       Map mapa = coleccion(new TreeMap<String,String>(),raiz);
       if (mapa.containsKey(palabra)) return mapa.get(palabra).toString();
       else return "*"+palabra+"*";
   }
   public Map<String,String> coleccion(Map<String,String> mapa,Nodo<String> nodo){
       if (nodo.getIzquierda() != null) mapa = coleccion(mapa,nodo.getIzquierda());
       mapa.put(nodo.getValor().getKey().toString(),nodo.getValor().getValue().toString());
       if (nodo.getDerecha() != null) mapa = coleccion(mapa,nodo.getDerecha());
       return mapa;
   }

   public Nodo llenar(String cadena) {
        File f;
        FileReader fr;
        BufferedReader br;
        Nodo nodo = null;
        try {

            f = new File (cadena);            
            fr = new FileReader(f);
            br = new BufferedReader(fr);      
            String linea;

            while( (linea = br.readLine()) != null) {
                ;
                linea =  linea.substring(linea.indexOf('(')+1,linea.indexOf(')'));
                nodo = insertar(linea,nodo);
            }                                            
            br.close();
            fr.close();

        }
        //Si el archivo se modifica manualmente o sucede cualquier otros tipo de
        //error, este sera comunicado con el usuario
        catch (Exception e) {

            System.err.println("Se produjo un error: " + e);                 

        }                
        return nodo;
    }
   
}
