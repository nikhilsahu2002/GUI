import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

public class Scrolle {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Pannel");
        frame.setBounds(100, 100, 400, 300);
        frame.setLayout(new GridLayout());
        frame.setVisible(true);

        // JScrollPane scrollPane = new JScrollPane();
        // scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        // scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        // scrollPane.setBounds(100, 100,200, 100);
       
        // frame.add(scrollPane);


        // Panel panel = new Panel();
        // panel.setBackground(Color.CYAN);
        // panel.setBounds(100, 100, 200, 200);
        // panel.setVisible(true);


        // Panel panel2 = new Panel();
        // panel2.setBackground(Color.GREEN);
        // panel2.setBounds(400, 400, 200, 200);
        // panel2.setVisible(true);

        // JSplitPane jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,panel,panel2);
        // frame.add(jSplitPane);

        // JPanel j1 = new JPanel();
        // JPanel j2 = new JPanel();
        // JPanel j3 = new JPanel();

        // j1.setBackground(Color.BLACK);
        // j2.setBackground(Color.ORANGE);
        // j3.setBackground(Color.PINK);

        // JTabbedPane tabbedPane  = new JTabbedPane();
        // tabbedPane.setBounds(50, 50, 200, 200);
        // tabbedPane.add("main",j1);
        // tabbedPane.add("Sales",j2);
        // tabbedPane.add("Contact Us",j3);

        // frame.add(tabbedPane);

        JToolBar jToolBar = new JToolBar();
        jToolBar.setRollover(true);
        
        JButton jButton = new JButton("File");
        jToolBar.add(jButton);
        jToolBar.addSeparator();

        jToolBar.setBounds(0, 00, 50,50);

        frame.add(jToolBar);
    }
}
