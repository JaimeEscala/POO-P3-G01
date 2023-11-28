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
    
    private int[] sectoresCubiertos = new int[4];
    
    public Auspiciante(String id, String nombre, String email, String sitioWeb, String telefono, String nResponsable, String direccion, String[] redesSociales, int[] sectoresCubiertos){
        super(id,nombre,email, sitioWeb, telefono, nResponsable, direccion, redesSociales);
        this.sectoresCubiertos = sectoresCubiertos;
        
    }
    
    public int[] getSectoresCubiertos(){
        return this.sectoresCubiertos;
    }
    
    public void setSectoresCubiertos(int[] sectoresCubiertos){
        this.sectoresCubiertos = sectoresCubiertos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nsectoresCubiertos: " + getSectoresCubiertos();
    }
    
    
    
}
