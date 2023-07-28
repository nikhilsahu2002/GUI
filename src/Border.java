import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.JFrame;

public class Border {
    public static void main(String[] args) {
        
        JFrame jFrame =new JFrame("Gui Cours");
        jFrame.setBounds(100, 100, 1000, 1000);
        jFrame.setVisible(true);

        JButton b1 = new JButton("north");
        JButton b2 = new JButton("south");
        JButton b3 = new JButton("east");
        JButton b4 = new JButton("west");
        JButton b5 = new JButton("center");

        jFrame.setLayout(new BorderLayout());
        jFrame.add(b1, BorderLayout.NORTH);
        jFrame.add(b2,BorderLayout.SOUTH);
        jFrame.add(b3,BorderLayout.EAST);
        jFrame.add(b4,BorderLayout.WEST);
        jFrame.add(b5,BorderLayout.CENTER);
    }
}
