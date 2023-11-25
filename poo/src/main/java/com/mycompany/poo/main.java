/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

import clases.Feria;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class main {

    public static ArrayList<Feria> ferias=new ArrayList();
    public static void main(String[] args) {
        System.out.println("hello world");   
    }
    public static void getFeriaInfo(String codigo){
       ArrayList<Feria> ferias=main.ferias;
       for (Feria feria: ferias){
          if (feria.getNombre()==codigo){
              System.out.println("Nombre de la feria: " + feria.getNombre());
              System.out.println("Tematica: "+feria.getDescripcion());
              System.out.println("Lugar de la feria: "+feria.getLugar());
              System.out.println("Fechas disponibles: "+ feria.getFecha_inicio() +" hasta "+ feria.getFecha_fin());
              System.out.println("Horarios de feria: "+feria.getHorario());
              
          }
       }
    }
}
