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
public class administrarDocente {

    private ArrayList<Docente> listaDocentes = new ArrayList();
    private File archivo = null;

    public administrarDocente(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Docente> getListaDocentes() {
        return listaDocentes;
    }

    public void setlistaDocentes(ArrayList<Docente> listaDocentes) {
        this.listaDocentes = listaDocentes;
    }

    @Override
    public String toString() {
        return "listaDocentes=" + listaDocentes;
    }

    //extra mutador
    public void setDocente(Docente d) {
        this.listaDocentes.add(d);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Docente t : listaDocentes) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getUsuario() + ";");
                bw.write(t.getContrasena() + ";");
                bw.write(t.getNumeroRegistro() + ";");
                bw.write(t.getTituloUniversitario() + ";");
                bw.write(t.getTituloPostgrado() + ";");
                bw.write(t.getVecesImpartidas() + ";");
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
        listaDocentes = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaDocentes.add(new Docente(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
