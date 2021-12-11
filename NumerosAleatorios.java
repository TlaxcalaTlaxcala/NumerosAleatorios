/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosaleatorios;

import javax.swing.JOptionPane;


public class NumerosAleatorios {
   
    // @utor Ery

    public static void main(String[] args) {
       
        String nombre;
        int edad;
       String Numtel;
       
       nombre=JOptionPane.showInputDialog("Ingrese el nombre: ");
       edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
       JOptionPane.showMessageDialog(null,"ingrese los datos correctamente");
    }
    
}
