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
public class Controlador_VentanaPrincipal implements ActionListener {
    
    private ManejaEstudante manejaEstudiante;
    
    public Controlador_VentanaPrincipal() {
            this.manejaEstudiante = new ManejaEstudante();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Salir")){
            System.exit(0);
        }else{
            if(e.getActionCommand().equals("Manipular estudiantes")){
            this.manejaEstudiante.setVisible(true);
            
            }

       }
    }
    
}
