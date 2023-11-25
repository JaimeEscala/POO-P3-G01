/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Feria {
    private String nombre; 
    private String descripcion; 
    private String lugar;
    private String fecha_inicio;
    private String fecha_fin;
    private String horario;
    private ArrayList<Auspiciante> lista_auspiciantes;
    private ArrayList<Stand> lista_stands; 

    public Feria(String nombre, String descripcion, String lugar, String fecha_inicio, String fecha_fin, String horario, ArrayList<Auspiciante> lista_auspiciantes) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lugar = lugar;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.horario = horario;
        this.lista_auspiciantes = lista_auspiciantes;
    }
//kjasdkdnaknd
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ArrayList<Auspiciante> getLista_auspiciantes() {
        return lista_auspiciantes;
    }

    public void setLista_auspiciantes(ArrayList<Auspiciante> lista_auspiciantes) {
        this.lista_auspiciantes = lista_auspiciantes;
    }
    


}
