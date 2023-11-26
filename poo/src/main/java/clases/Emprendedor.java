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
    
    public Emprendedor(String id, String nombre, String email, String sitioWeb, String telefono, String nResponsable, String direccion, int[] redesSociales, String descripcion){
        super(id, nombre, email, sitioWeb, telefono, nResponsable, direccion, redesSociales);
        this.descripcion = descripcion;
    }
    
}
