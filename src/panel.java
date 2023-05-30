import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;


public class panel {
    public static void main(String[] args) {
        // JPanel for working with JPanel we need  Jframe too 
        JFrame jFrame = new JFrame("First GUI");
        jFrame.setBounds(100, 100, 400, 300);
        jFrame.setVisible(true);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBackground(Color.blue);
        jPanel.setBounds(100, 100, 100, 200);
        jPanel.setVisible(true);

        // adding JPanel to JFrame 
        jFrame.add(jPanel);
    }
}
