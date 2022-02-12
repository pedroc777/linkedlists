/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.estructuras.principal;

import java.util.LinkedList;
import uam.pvoe.estructuras.clases.Alumno;
import uam.pvoe.estructuras.operaciones.OperacionesLista;

/**
 *
 * @author pedro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        
        lista = insertarAlumno(lista);
        imprimirLista(lista);
        mostrarAlumno(lista, "Matricula 2");
        mostrarAlumno(lista, "9825983749");
        lista = borrarAlumno(lista, "343434");
        imprimirLista(lista);
        lista = borrarAlumno(lista, "Matricula 3");
        imprimirLista(lista);
    }
    
    public static LinkedList insertarAlumno(LinkedList lista){
        OperacionesLista operaciones = new OperacionesLista();
       
        
        for(int i=0;i<5;i++){
            Alumno alumno = new Alumno();
            alumno.setMatricula("Matricula " + (i+1));
            alumno.setNombre("Nombre " + (i+1));
            alumno.setPrimerApellido("Primer Apellido" + (i+1));
            alumno.setSegundoApellido("Segundo Apellido " + (i+1));
            alumno.setLicenciatura("Licenciatura " + (i+1));
            
            lista = operaciones.insertarAlumno(lista, alumno);
        }
        
        return lista;
    }
    
    public static void imprimirLista(LinkedList lista){
        OperacionesLista operaciones = new OperacionesLista();
        operaciones.imprimirLista(lista);
    }
    
    public static int buscarAlumno(LinkedList lista, String matricula){
        OperacionesLista operaciones = new OperacionesLista();
        int posicion;
        
        posicion = operaciones.buscarAlumno(lista, matricula);
        return posicion;
    }
    
    public static void mostrarAlumno(LinkedList lista, String matricula){
        OperacionesLista operaciones = new OperacionesLista();
        int posicion;
        
        posicion = buscarAlumno(lista, matricula);
        
        if(posicion < 0){
            System.out.println("El alumno no existe");
        }
        else{
            Alumno alu = operaciones.regresarAlumno(lista, posicion);
            System.out.println("Sus datos son: " + alu.toString());
        }
    }
    
    public static LinkedList borrarAlumno(LinkedList lista, String matricula){
        OperacionesLista operaciones = new OperacionesLista();
        int posicion;
        
        posicion = buscarAlumno(lista, matricula);
        
        if(posicion < 0){
            System.out.println("No existe el alumno");
        }
        else{
            lista = operaciones.borrarAlumno(lista, posicion);
        }
        return lista;
    }
}
