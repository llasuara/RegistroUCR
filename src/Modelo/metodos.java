/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.ManejaEstudante;
import javax.swing.JOptionPane;

/**
 *
 * @author llasu
 */
public class metodos {
    private ArrayEstudiante arrayEst;
    private ManejaEstudante manejaEst;
    private Estudiante nuevoEstudiante;

    public metodos(ArrayEstudiante arrayE) {
        this.arrayEst=arrayE;
        this.manejaEst= new ManejaEstudante();
        //this.nuevoEstudiante= new Estudiante();
    }
 
    
    public void agregar(){
        if(!manejaEst.jt_nombre.getText().equals("")&&manejaEst.jt_carnet.getText().equals("")&&manejaEst.jt_correo.getText().equals("")){
            if(arrayEst.buscarEstudiante(jt_carnet.getText())==-1)//Si no se encuentra un estudiante con el mismo carnet
            {
                nuevoEstudiante= new Estudiante (jt_nombre.getText(),jt_carnet.getText(),jt_carnet.getText());//Se agrega un nuevo estudiante al vector
                JOptionPane.showMessageDialog("El estudiante ha sido agregado con exito");
            }    
        }
        else{
               JOptionPane.showMessageDialog("Este estudiante ya esta registrado, por favor verifique nuevamente"); 
        }
        else{
               JOptionPane.showMessageDialog("Por favor llene los espacios vacios");
            }
   
    }//Fin del metodo Agregar 
    

}//Fin de la clase
