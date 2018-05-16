import java.awt.Color;
import javax.swing.*;

public class TweedeGraadsFunctie extends JFrame
{
    public static void main(String[] args) 
    {
      //maak een frame
        JFrame frame = new TweedeGraadsFunctie();
        frame.setSize(1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setTitle("TweedeGraadsFunctie");
        JPanel panel = new Paneel();
        panel.setBackground(Color.BLACK);
        frame.setContentPane(panel);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}