/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.ArrayList;
public class ArrayEstudiante {
    private ArrayList<Estudiante>arrayEstudiante;
    
    public ArrayEstudiante(){
        arrayEstudiante= new ArrayList();
    }
    public void agregarEstudiante(Estudiante estudiante){
        arrayEstudiante.add(estudiante);
    }
    public int buscarEstudiante(String carnet){
        int posicion=-1;
        for(int i=0;i>arrayEstudiante.size();i++){
            if(arrayEstudiante.get(i).getCarnet().equals(carnet)){
               posicion=i; 
            }
        }
        return posicion;
    }
    public void eliminarEstudiante(int posicion){
        arrayEstudiante.remove(posicion);
    }
    
 
    
}//Fin de la clase 
