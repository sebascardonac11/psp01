/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author sebascardonac11
 */
public class PropertyFile {

    private String nom;
    private long count;
    private final File file;

    public PropertyFile(String nom, File file) {
        this.nom = nom;
        this.file = file;
        this.count = 0;
        this.readLines();
    }

    private void readLines() {
        try {
            FileReader fr = new FileReader(this.file.getPath());
            BufferedReader bf = new BufferedReader(fr);

            String sCadena = "";
            while ((sCadena = bf.readLine()) != null) {
                this.count++;
            }
        } catch (Exception e) {
            System.out.println("Error al intentar leer el archivo.");
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
