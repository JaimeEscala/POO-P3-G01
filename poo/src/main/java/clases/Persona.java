/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String id;
    private String nombre; 
    private String email;
    private String sitioWeb; 
    private String telefono;
    private String nResponsable;
    private String[] redesSociales = new String[7];
    private String direccion;
    
    
    public Persona(String id, String nombre, String email, String sitioWeb, String telefono, String nResponsable, String direccion, String[] redesSociales){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.sitioWeb = sitioWeb;
        this.telefono = telefono;
        this.nResponsable = nResponsable;
        this.direccion = direccion;
        this.redesSociales = redesSociales;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getnResponsable() {
        return nResponsable;
    }

    public String[] getRedesSociales() {
        return redesSociales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setnResponsable(String nResponsable) {
        this.nResponsable = nResponsable;
    }

    public void setRedesSociales(String[] redesSociales) {
        this.redesSociales = redesSociales;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String toString(){
        return "Cedula o RUC: "+this.id+"\nNombre: "+this.nombre+"\nCorreo electronico: "+this.email+"\nSitio Web: "+this.sitioWeb+"\nTelefono: "+this.telefono+"\nNombre del Responsable: "+this.nResponsable+"\nDireccion: "+this.direccion+"\nRedes Sociales: "+this.redesSociales;
    }
    
    
}
