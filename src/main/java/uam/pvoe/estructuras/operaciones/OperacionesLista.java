/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.estructuras.operaciones;

import java.util.LinkedList;
import uam.pvoe.estructuras.clases.Alumno;

/**
 *
 * @author pedro
 */
public class OperacionesLista {
    
    public LinkedList insertarAlumno(LinkedList listaAlumnos, Alumno alumno){
        listaAlumnos.add(alumno);
        return listaAlumnos;
    }
    
    public void imprimirLista(LinkedList lista){
        for(int i = 0; i<lista.size(); i++){
            Alumno al = (Alumno)lista.get(i);//conversión o cast de forma sencilla. un tipo a otro
            System.out.println(al.toString());
        }
    }
    
    public Alumno regresarAlumno(LinkedList listaAlumnos, int posicion){
        Alumno al = (Alumno)listaAlumnos.get(posicion);
        return al;
    }
    
    public LinkedList borrarAlumno(LinkedList listaAlumnos, int posicion){
        listaAlumnos.remove(posicion);
        return listaAlumnos;
    }
    
    public int buscarAlumno(LinkedList listaAlumnos, String matricula){
        int posicion = -1;//esto no existe
        for(int i = 0; i<listaAlumnos.size(); i++){//búsqueda secuencial
            Alumno al = (Alumno)listaAlumnos.get(i); //get recupera los elementos
            if(al.getMatricula().compareTo(matricula) == 0){ //si sí, existe; las cadenas con equivalentes
                posicion = i;
                break;//para que deje de buscar
            }
        }
        return posicion;
    }
}
