/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

import clases.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class main {

    public static ArrayList<Feria> ferias = new ArrayList();
    public static ArrayList<Stand> stands = new ArrayList();
    public static ArrayList<Auspiciante> auspiciantes = new ArrayList();
    
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Administracion de Ferias");
        System.out.println("2. Administracion de emprendedores");
        System.out.println("3. Administracion de auspiciantes");
        System.out.println("4. Administracion de stands");
        System.out.println("5. Salir");
        
        int opciones = sc.nextInt();
        sc.nextLine();
        
        switch(opciones){
            
            case 1: 
                for(Feria f: ferias){
                    System.out.println("Ferias: " + "\n" + f.toString());
                }
                System.out.println("1. Ver informacion de feria");
                System.out.println("2. Registrar feria");
                System.out.println("3. Editar feria");
                System.out.println("4. Consultar emprendedores en feria");
                System.out.println("5. Regresar");
                int opcionesFeria = sc.nextInt();
                sc.nextLine();
                
                switch(opcionesFeria){
                    case 1:
                         System.out.println("Ingrese el codigo de la feria que desea informacion: ");
                         String codigoF = sc.nextLine();
                         getFeriaInfo(codigoF);
                    break;
                        
                    case 2: 
                         registrarFeria();
                         distribucionStand();
                    break;
                    
                    case 3: //Editsr feria
                        
                    break;
                    
                    case 4: //Consultar emprendedores en feria
                        
                    break;
                }
                
            break;
            
            case 2:
                
            break;
            
            case 3:
                
            break;
            
            case 4:
                
            break;
            
            case 5:
                
            break;
        }
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
              System.out.println("Lista de auspiciantes: " + feria.getLista_auspiciantes());
              System.out.println("Lista de Stands: " + feria.getLista_stands());
              
          }
       }
    }
    
    public static void registrarFeria(){
        
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Ingrese Nombre: ");
        String nomF = sc1.nextLine();
        sc1.nextLine();
        System.out.println("Ingrese Descripcion: ");
        String desF = sc1.nextLine();
        sc1.nextLine();
        System.out.println("Ingrese Lugar: ");
        String lugarF = sc1.nextLine();
        sc1.nextLine();
        System.out.println("Ingrese fecha inicio en el formato dd-mm-yyy: ");
        String fechaInF = sc1.nextLine();
        sc1.nextLine();
        System.out.println("Ingrese fecha final en el formato dd-mm-yyy: ");
        String fechaOutF = sc1.nextLine();
        sc1.nextLine();
        System.out.println("Ingrese horario: ");
        String horarioF = sc1.nextLine();
        sc1.nextLine();
        Feria objetoF = new Feria(nomF, desF, lugarF, fechaInF, fechaOutF, horarioF, auspiciantes, stands);
        ferias.add(objetoF);
    }
    
    public static void distribucionStand(){
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Stands: ");
        int standsF = sc2.nextInt();
        sc2.nextLine();
        
        Secciones secciones1 = Secciones.Seccion1;
        Secciones secciones2 = Secciones.Seccion2;
        Secciones secciones3 = Secciones.Seccion3;
        Secciones secciones4 = Secciones.Seccion4;
        
        System.out.println("Ingrese el numero de la seccion donde estaran los stands del 1 al 4: ");
        int secStand = sc2.nextInt();
        sc2.nextLine();
        switch(secStand){
            case 1:
                System.out.println(secciones1);
            break;
            
            case 2:
                System.out.println(secciones2);
            break;
            
            case 3:
                System.out.println(secciones3);
            break;
            
            case 4:
                System.out.println(secciones4);
            break;
        }
    }
    
    public static void registrarAuspiciante(){
        
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Ingrese Número de cédula o RUC : ");
        String id = sc1.nextLine();
        sc1.nextLine();
        System.out.println("Ingrese Nombre: ");
        String nombre = sc1.nextLine();
        sc1.nextLine();
        System.out.println("Ingrese Nombre persona responsable: ");
        String nResponsable = sc1.nextLine();
        sc1.nextLine();
        System.out.println("Ingresar Teléfono: ");
        String telefono = sc1.nextLine();
        sc1.nextLine();
        System.out.println("Ingrese Email ");
        String email = sc1.nextLine();
        sc1.nextLine();
        System.out.println("Ingrese Dirección: ");
        String direccion = sc1.nextLine();
        sc1.nextLine();
        System.out.println("Ingrese Sitio web : ");
        String sitioWeb = sc1.nextLine();
        sc1.nextLine();
        System.out.println("Ingresar Sectores cubieros con el formato sector1, sector2,... : ");
        String sectoresCubiertos = sc1.nextLine(); 
        sc1.nextLine();
        System.out.println("Ingrese Nombres de cada red social que maneja: ");
        String redesSociales = sc1.nextLine();
        sc1.nextLine();
        String[] arrayX = sectoresCubiertos.split(",");
        int[] arraySectoresCubiertos = new int[arrayX.length];
        for (int i = 0; i < arrayX.length; i++) {
                arraySectoresCubiertos[i] = Integer.parseInt(arrayX[i]);
        }
        String[] arrayRedesSociales = redesSociales.split(",");
        Auspiciante objetoA = new Auspiciante( id, nombre, email, sitioWeb, telefono, nResponsable, direccion, arrayRedesSociales, arraySectoresCubiertos);
        for(Auspiciante c: auspiciantes){
            if (c.getId().equals(id)){
                System.out.println("El auspiciante ingresado ya esta registrado");
            }
            else {
                auspiciantes.add(objetoA);
            }
        }
    }
    
    public static void editarAuspiciante(){
        
    }
    
}

