/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
// JaimeEscala.

public class Feria {
    
    private String nombre; 
    private String descripcion; 
    private String lugar;
    private String fecha_inicio;
    private String fecha_fin;
    private String horario;
    private ArrayList<Auspiciante> lista_auspiciantes;
    private ArrayList<Stand> lista_stands; 

    public Feria(String nombre, String descripcion, String lugar, String fecha_inicio, String fecha_fin, String horario, ArrayList<Auspiciante> lista_auspiciantes, ArrayList<Stand> lista_stands) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lugar = lugar;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.horario = horario;
        this.lista_auspiciantes = lista_auspiciantes;
        this.lista_stands = lista_stands;
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

    public ArrayList<Stand> getLista_stands() {
        return lista_stands;
    }

    public void setLista_stands(ArrayList<Stand> lista_stands) {
        this.lista_stands = lista_stands;
    }
    
    public String toString(){
        return "Codigo: " + getCodigo() + "\nNombre: " + getNombre() + "\nFecha inicio: " + getFecha_inicio() + "\nLugar: " + getLugar() + "\nCantidad de auspiciantes: " + getLista_auspiciantes();
    }

    public String getCodigo(){
        Random r = new Random();
        String codigo = "";
        for(int i = 0; i<5; i++){
            int digito = r.nextInt(10);
            codigo += digito;
        }
        return codigo;
    }
}
