/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import com.sun.glass.events.KeyEvent;
import javax.swing.JTextField;
import universidadejemplo.Vistas.GestionMaterias;

/**
 *
 * @author rar
 */
public class ValidacionesController {
    
    public static GestionMaterias ventana = new GestionMaterias();
    
    public static void validaNumero(java.awt.event.KeyEvent evt) {
        final char tecla = evt.getKeyChar();
        if (Character.isDigit(tecla) 
                || tecla == KeyEvent.VK_BACKSPACE
                || tecla == KeyEvent.VK_CONTROL
                || tecla == KeyEvent.VK_DELETE
                || (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_V)) {
        } else {
            evt.consume();
        }
    }
    
    public static void anulaPaste(java.awt.event.KeyEvent evt) {
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_V) {
            evt.consume();
        }
    }
    
    public static void validaNombre(java.awt.event.KeyEvent evt) {
        Character tecla = evt.getKeyChar();
        if (Character.isLetter(tecla) 
                || tecla == KeyEvent.VK_SPACE
                || tecla == KeyEvent.VK_DELETE
                || tecla == KeyEvent.VK_BACKSPACE
                || tecla == KeyEvent.VK_MINUS){
            evt.setKeyChar(Character.toUpperCase(tecla));
        } else {
            evt.consume();
        }

        //elimina primer caracter si no es una letra
        String texto = ventana.getjTnombre().getText();
        
        if (texto.length() > 0) {
            if (!Character.isLetter(texto.charAt(0))) {
                texto = texto.length() > 1 ? texto.substring(1) : "";
            }
        }

        // reemplaza guiones duplicados por un guion
        texto = texto.replaceAll("[-]+", "-");
        // reemplaza espacios duplicados por un espacio
        texto = texto.replaceAll("[ ]+", " ");

        JTextField nombre = ventana.getjTnombre();
        nombre.setText(texto);

        String nom = ventana.getjTnombre().getText();
        if (nom.length() > 100) {
            evt.consume(); 
        }
    }

    
    
}
