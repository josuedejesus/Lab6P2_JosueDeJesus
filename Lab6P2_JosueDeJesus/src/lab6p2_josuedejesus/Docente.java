/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_josuedejesus;

/**
 *
 * @author josue
 */
public class Docente extends Persona{
    private String tituloUniversitario;
    private String tituloPostgrado;
    private int vecesImpartidas; 

    public Docente() {
        super();
    }

    public Docente(String nombre, String apellido, String usuario, String contrasena, int numeroRegistro, String tituloUniversitario, String tituloPostgrado, int vecesImpartidas, String facultad) {
        super(nombre, apellido, usuario, contrasena, numeroRegistro, facultad);
        this.tituloUniversitario = tituloUniversitario;
        this.tituloPostgrado = tituloPostgrado;
        this.vecesImpartidas = vecesImpartidas;
    }

    public String getTituloUniversitario() {
        return tituloUniversitario;
    }

    public void setTituloUniversitario(String tituloUniversitario) {
        this.tituloUniversitario = tituloUniversitario;
    }

    public String getTituloPostgrado() {
        return tituloPostgrado;
    }

    public void setTituloPostgrado(String tituloPostgrado) {
        this.tituloPostgrado = tituloPostgrado;
    }

    public int getVecesImpartidas() {
        return vecesImpartidas;
    }

    public void setVecesImpartidas(int vecesImpartidas) {
        this.vecesImpartidas = vecesImpartidas;
    }

    @Override
    public String toString() {
        return super.toString() + "Docente{" + "tituloUniversitario=" + tituloUniversitario + ", tituloPostgrado=" + tituloPostgrado + ", vecesImpartidas=" + vecesImpartidas + '}';
    }
    
    
}
