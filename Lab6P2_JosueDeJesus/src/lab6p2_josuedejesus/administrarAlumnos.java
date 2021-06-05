/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_josuedejesus;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class administrarAlumnos {
        private ArrayList<Alumno> listaAlumnos = new ArrayList();
    private File archivo = null;

    public administrarAlumnos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setlistaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    @Override
    public String toString() {
        return "listaAlumnos=" + listaAlumnos;
    }

    //extra mutador
    public void setAlumnos(Alumno a) {
        this.listaAlumnos.add(a);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Alumno t : listaAlumnos) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getUsuario() + ";");
                bw.write(t.getContrasena() + ";");
                bw.write(t.getEdad()+ ";");
                bw.write(t.getNumeroRegistro() + ";");
                bw.write(t.getId() + ";");
                bw.write(t.getCarrera() + ";");
                bw.write(t.getAnoCarerra() + ";");
                bw.write(t.getPromedio() + ";");
                bw.write(t.getFacultad() + ";");
            }
            bw.flush();

        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaAlumnos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaAlumnos.add(new Alumno(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
