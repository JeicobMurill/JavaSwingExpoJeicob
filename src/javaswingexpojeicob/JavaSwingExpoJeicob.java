/**
 *
 * @author Jeicob Murillo
 */

package javaswingexpojeicob;


import javax.swing.*;

public class JavaSwingExpoJeicob {
    public static void main(String[] args) {
        // Crear el JFrame principal
        JFrame frame = new JFrame("Ventana Principal");
        frame.setSize(600, 400);

        // Crear el JDesktopPane
        JDesktopPane desktop = new JDesktopPane(); // Espacio principal
        frame.add(desktop);

        // Crear el JTextArea
        JTextArea textArea = new JTextArea("Texto de ejemplo...");
        JScrollPane scrollPane = new JScrollPane(textArea); // Barra de desplazamiento

        // Crear el JInternalFrame
        JInternalFrame internalFrame = new JInternalFrame("Documento", true, true, true, true); // Ventana interna
        internalFrame.add(scrollPane); // Agregar el JScrollPane al JInternalFrame
        internalFrame.setSize(300, 200); // Establecer el tamaño de la ventana interna
        internalFrame.setLocation(50, 50); // Establecer la ubicación de la ventana interna
        internalFrame.setVisible(true); // Hacer visible la ventana interna

        // Agregar el JInternalFrame al JDesktopPane
        desktop.add(internalFrame);

        // Hacer visible el JFrame
        frame.setVisible(true);
    }
}