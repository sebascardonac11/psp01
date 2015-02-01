/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos;

import java.io.File;
import java.util.LinkedList;

/**
 * Esta clase se encarga de ubicar el directorio pasado al constructor y a
 * partir de alli contar los archivos .java, segun estandar definido.
 *
 * @author sebascardonac11
 */
public class Count {

    private String path = "./";
    private File dir = null;
    private LinkedList files;

    /**
     * Constructor de la clase Count.
     *
     * @param path Directorio donde se va listar los archivos.
     */
    public Count(String path) {
        this.path = path;
        this.dir = new File(path);
        this.files = new LinkedList();
        this.count();
    }
    /**
     * Metodo que inicia el conteo de ficheros.
     */
    private void count() {
        String[] pathFiles = dir.list();
        File[] files=dir.listFiles();
        if (pathFiles == null) {
            System.out.println("No hay ficheros en el directorio especificado");
        } else {
            for (int x = 0; x < pathFiles.length; x++) {
               this.files.add(new PropertyFile(pathFiles[x],files[x]));
            }
        }
    }
    public String getSummary(){
        String res="";
        for (int i = 0; i < this.files.size(); i++) {
            res+= " "+ ((PropertyFile)this.files.get(i)).getNom()+ "  Numero de lineas:"+ ((PropertyFile)this.files.get(i)).getCount() + "\n";
        }
        return res;
    }

    /**
     * Lista ficheros de la carpeta
     */
    public String[] lstFiles() {
        String[] ficheros = dir.list();
        if (ficheros == null) {
            System.out.println("No hay ficheros en el directorio especificado");
        } else {
            for (int x = 0; x < ficheros.length; x++) {
                System.out.println(ficheros[x]);
            }
        }
        return ficheros;
    }
}
