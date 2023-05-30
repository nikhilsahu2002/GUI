import javax.swing.*;

public class jfarme extends JFrame {
    public static void main(String[] args) {
        // JFarem is top Level Componet That Include All other components 
        // JFrame  jFrame = new JFrame("First GUI Frame");
        // jFrame.setBounds(200,200,400,300);
        // jFrame.setLayout(null);
        // jFrame.setVisible(true);
        new jfarme();
    }

    
    public jfarme(){
        // Always Do it Under The constructer 
        setTitle("First Gui");
        setBounds(100, 100,400,300);
        setVisible(true);
        setLayout(null);
    }
}
