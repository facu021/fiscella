import java.awt.*;
import javax.swing.*;

public class cursor extends JPanel {
    public static void main(String[] args) {
// Crea una nueva ventana
        JFrame frame = new JFrame("Asterisco en Pantalla");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Crea un panel personalizado para dibujar el asterisco
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
// Dibuja el asterisco en las coordenadas especificadas
                g.clearRect(1,1,300,300);
                g.drawString("*", 100, 100);
                g.clearRect(1,1,300,300);
                g.drawString("*", 100, 110);
            }
        };

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}