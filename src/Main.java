import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();
        interfaz.setContentPane(interfaz.getPrincipal());
        interfaz.setVisible(true);
        interfaz.setTitle("Búsqueda lienal y binaria");
        interfaz.setBounds(100,100,600,400);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
