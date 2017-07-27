/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.awt.Component;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author nestor.martinez
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField Jnombre;
    @FXML 
    private TextField JCodigo;
     
    
    LinkedList<Estudiante> listaE;
    private Component rootPane;
    
    @FXML
    private void Aceptar(ActionEvent event) {
        String nombre = Jnombre.getText();
        String codigo = JCodigo.getText();
        
        Estudiante objE = new Estudiante(nombre, codigo);
        boolean ss = listaE.add(objE);
        if(ss){
            Jnombre.setText("");
            JCodigo.setText("");
        }
    }
    @FXML
    private void Mostrar(ActionEvent event){
        String Mostrar = "";
        for(int i = 0; i<listaE.size();i++){
            Mostrar += listaE.get(i)+"\n"; 
        }
        JOptionPane.showMessageDialog(rootPane, Mostrar);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         listaE=new LinkedList<>();
         
    }    
    
}
