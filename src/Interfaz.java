import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {
    private JPanel Principal;
    private JButton btnBuscar;
    private JTextArea textABuscar;
    Buqueda buqueda = new Buqueda();

    public Interfaz() {
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textABuscar.setText(buqueda.tiempoLinearVSBinary());
                btnBuscar.setEnabled(false);
            }
        });
    }

    public JPanel getPrincipal(){
        return Principal;
    }


}


