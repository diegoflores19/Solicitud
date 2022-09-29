/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.Solicitud;

import mx.itson.Solicitud.ui.Ventana;

/**
 *
 * @author Diego
 */
public class Main {

    
    public static void main(String[] args) {
        
        Ventana principal = new Ventana();
        
        principal.setLocationRelativeTo(null);
        principal.setTitle("CURP");
        principal.setVisible(true);
        
    }
    
}
