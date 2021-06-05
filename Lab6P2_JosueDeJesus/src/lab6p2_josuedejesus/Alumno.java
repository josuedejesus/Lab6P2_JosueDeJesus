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
public class Alumno extends Persona {

    private int edad;
    private int id;
    private String carrera;
    private int anoCarerra;
    private Double promedio;

    public Alumno() {
        super();
    }

    public Alumno(String nombre, String apellido, String usuario, String contrasena, int edad, int numeroRegistro, int id, String carrera, int anoCarerra, Double promedio, String facultad) {
        super(nombre, apellido, usuario, contrasena, numeroRegistro, facultad);
        this.edad = edad;
        this.id = id;
        this.carrera = carrera;
        this.anoCarerra = anoCarerra;
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

    public int getAnoCarerra() {
        return anoCarerra;
    }

    public void setAnoCarerra(int anoCarerra) {
        this.anoCarerra = anoCarerra;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "edad=" + edad + ", id=" + id + ", carrera=" + carrera + ", snoCarerra=" + anoCarerra + ", promedio=" + promedio + '}';
    }
}
