package Ejercicio_07;

import java.io.IOException;

import javax.swing.JFrame;

public class Pruebajf {
    public static void main(String[] args) throws IOException {
        DemoJFileChooser aplicacion = new DemoJFileChooser();
        aplicacion.setSize(400, 400);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setVisible(true);
}
}
