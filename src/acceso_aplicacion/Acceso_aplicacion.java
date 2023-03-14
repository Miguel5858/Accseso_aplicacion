/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acceso_aplicacion;
import javax.swing.AbstractAction.*;
import javax.swing.JOptionPane;

/**
 *
 * @author TRABAJO
 */
public class Acceso_aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String clave="Miguel";
        String pass="";
        
        while(clave.equals(pass)==false){
            pass=JOptionPane.showInputDialog("Introduce la contraseña, por favor");
            
            if(clave.equals(pass)==false){
                //System.out.println("Contraseña incorrecta");
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }
        }
        //System.out.println("Contraseña correcta");
        JOptionPane.showMessageDialog(null, "Contraseña correcta");
        
    }
    
}
