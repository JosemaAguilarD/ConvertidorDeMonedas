/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pe.isil.conversormonedas;

import pe.isil.conversormonedas.vista.MenuConversor;

/**
 *
 * @author 51992
 */
public class Principal {

    public static void main(String[] args) {
       MenuConversor menu = new MenuConversor();
       //Función para que muestre la pantalla
       menu.setVisible(true);
       //Función para que se muestre en el medio relativo a cualquier tamaño
       menu.setLocationRelativeTo(null);
    }
}
