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
public class Alumno extends Persona{
    private int edad;
    private int id;
    private String carrera;
    private int snoCarerra;
    private Double promedio;

    public Alumno() {
        super();
    }

    public Alumno(int edad, int id, String carrera, int snoCarerra, Double promedio, String nombre, String apellido, String usuario, String contrasena, int numeroRegistro, String facultad) {
        super(nombre, apellido, usuario, contrasena, numeroRegistro, facultad);
        this.edad = edad;
        this.id = id;
        this.carrera = carrera;
        this.snoCarerra = snoCarerra;
        this.promedio = promedio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSnoCarerra() {
        return snoCarerra;
    }

    public void setSnoCarerra(int snoCarerra) {
        this.snoCarerra = snoCarerra;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "edad=" + edad + ", id=" + id + ", carrera=" + carrera + ", snoCarerra=" + snoCarerra + ", promedio=" + promedio + '}';
    }
}
