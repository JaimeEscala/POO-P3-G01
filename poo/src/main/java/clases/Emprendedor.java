/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author jaesc
 */
public class Emprendedor extends Persona{
    
    String descripcion;
    
    public Emprendedor(String id, String nombre, String email, String sitioWeb, String telefono, String nResponsable, String direccion, String[] redesSociales, String descripcion){
        super(id, nombre, email, sitioWeb, telefono, nResponsable, direccion, redesSociales);
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public String toString(){
        return super.toString()+"\nDescripcion: "+this.descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}
