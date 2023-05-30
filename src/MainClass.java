import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello ");
        // optain the input from joptionpane imput dialogs 

        String numberString = JOptionPane.showInputDialog("Enter The Numer");
        String SecondNumber = JOptionPane.showInputDialog("Enter The Second Number");
        int sum = Integer.parseInt(SecondNumber) + Integer.parseInt(numberString);
        
        //display the messages 
        JOptionPane.showMessageDialog(null,"The sum Of The Given Number Is " + sum,"sum of Thwo Number ",JOptionPane.PLAIN_MESSAGE);
        }
}
