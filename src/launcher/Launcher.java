package launcher;

import entities.*;
import gui.*;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            		
            	Student estudiante = new Student(120921, "Rodriguez", "Guillermo", "guille.rod.00@gmail.com", "https://github.com/BoaColorada", "/images/AlumnoIMG.png");
            	
            	SimplePresentationScreen presentacion = new SimplePresentationScreen(estudiante);
            	
            	presentacion.setVisible(true);
            }
        });
    }
}