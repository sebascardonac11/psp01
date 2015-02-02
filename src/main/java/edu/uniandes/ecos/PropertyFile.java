/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;

/**
 *
 * @author sebascardonac11
 */
public class PropertyFile {

    private String nom;
    private long count;
    private final File file;
    private LinkedList lineas;

    public PropertyFile(String nom, File file) {
        this.nom = nom;
        this.file = file;
        this.count = 0;
        this.readLines();
        this.lineas=new LinkedList();
    }

    private void readLines() {
        try {
            FileReader fr = new FileReader(this.file.getPath());
            BufferedReader bf = new BufferedReader(fr);
            
            String sCadena;
            while ((sCadena = bf.readLine()) != null) {
               if (this.isLine(sCadena)) {
                    this.count++;
                     System.out.println(this.count +") "+sCadena);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al intentar leer el archivo."+this.nom+"    "+e.getMessage());
        }
    }

    /**
     * Metodo que determina si la linea se debe contar o no, según las siguientes reglas:
     *      - Si la linea es vacia, no es valida.
     *      - Si la linea tiene solo {, no se cuenta, por eso se debe ir en una sola linea.
     *      - Si la linea tiene solo }, no se cuenta, por eso se debe ir en una sola linea.
     *      - Para los comentarios, se evaluan los * y los dos caracteres //.
     * @param line Cadena de caracteres a evaluar.
     * @return true si la cadena es valida para ser contada.
     */
    private boolean isLine(String line) {

        if (line.isEmpty()) {
            return false;
        } else {
            return !(line.contains("{") || line.contains("}") || 
                      line.contains("*")|| line.contains("//"));
        }
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the count
     */
    public long getCount() {
        return count;
    }

}
