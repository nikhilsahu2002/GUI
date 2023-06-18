import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AtomicComponent {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Atomic");
        jFrame.setLayout(new GridLayout());
        jFrame.setBounds(100, 100, 400, 400);
        jFrame.setVisible(true);

        // JButton jButton = new JButton("ClickMe");
        // jButton.setBounds(10,10,100,30);

        // // Event Handling 
        // jButton.addActionListener(new ActionListener() {

        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         // TODO Auto-generated method stub
        //         jFrame.getContentPane().setBackground(Color.blue);
        //     }
            
        // });

        // jFrame.add(jButton);

        // JLabel jLabel = new JLabel("Hello Friends ");
        // jFrame.add(jLabel);
        
        // JButton jButton = new JButton("Change Text");
        // jButton.addActionListener(new ActionListener() {

        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         jLabel.setText("Button is Clicked");
        //     }
            
        // });
        // jFrame.add(jButton);
        // jFrame.add(jLabel);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(100, 100, 500, 50);
       
        jFrame.add(jTextField);

      

        JLabel jLabel = new JLabel();

        JButton jButton = new JButton("Get Text Now ");
        jButton.addActionListener(new ActionListener() {
        

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
                String s = jTextField.getText();
                jLabel.setText(s);
            }
            
        });
         jFrame.add(jButton);
         jFrame.add(jTextField);
         jFrame.add(jLabel, jButton);


    }
}
