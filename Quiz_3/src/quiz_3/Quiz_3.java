/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Quiz_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numProductos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de productos a registrar"));
        Inventario[] arrInfo = new Inventario[numProductos];

        Inventario.input(arrInfo);
        Inventario.mostrar(arrInfo);
    }
}
