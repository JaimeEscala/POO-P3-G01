/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USUARIO
 */
public class Stand {
    
    private String codStand;
    private String fechaAsignacion;
    private Persona persona;
    
    public Stand(String codStand, String fechaAsignacion, Persona persona){
        this.codStand = codStand;
        this.fechaAsignacion = fechaAsignacion;
        this.persona = persona;
    }
    
    public String getCodStand(){
        return this.codStand;
    }
    
    public String getFechaAsignacion(){
        return this.fechaAsignacion;
    }
    
    public Persona getPersona(){
        return this.persona;
    }
    
    public void setFechaAsignacion(String fechaAsignacion){
        this.fechaAsignacion = fechaAsignacion;
    }
    
    public void setPersona(Persona persona){
        this.persona = persona;
    }
}
