/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ManejaEstudante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author estudiante
 */
public class Controlador_Mantenimiento_Estudiante implements ActionListener{

    public final static int CARNET = 1;
    public final static int NOMBRE = 2;
    public final static int CORREO = 3;
    public final static int AGREGAR = 4;
    public final static int BUSCAR = 5;
    public final static int EDITAR = 6;
    public final static int ELIMINAR = 7;    
    
    private ManejaEstudante maneja_estudiante;

    
    public Controlador_Mantenimiento_Estudiante(ManejaEstudante maneja_estudiante) {
        this.maneja_estudiante = maneja_estudiante;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        int codigo = this.maneja_estudiante.get_codigo_por_fuente(
                ae.getSource());
        
        switch(codigo){
            case AGREGAR:
            case ELIMINAR:
            case BUSCAR:
            case EDITAR:
        
        }
       
    }
    
}
