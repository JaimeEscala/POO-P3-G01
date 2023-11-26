/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USUARIO
 */
public class Auspiciante extends Persona{
    
    Feria codigoFeria;
    int[] sectoresCubiertos = new int[4];
    
    public Auspiciante(String id, String nombre, String email, String sitioWeb, String telefono, String nResponsable, String direccion, int[] redesSociales, int[] sectoresCubiertos, Feria codigoFeria){
        super(id,nombre,email, sitioWeb, telefono, nResponsable, direccion, redesSociales);
        this.codigoFeria = codigoFeria;
        this.sectoresCubiertos = sectoresCubiertos;
        
    }
    
    
}
