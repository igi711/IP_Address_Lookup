import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.JFrame;



public class LabelExample extends Frame implements ActionListener {
        JTextField textf; JLabel label; JButton button; JFrame frame; JLabel title; 
        LabelExample() {
            title = new JLabel("IP Address Lookup");
            title.setBounds(160,30,300,40);
            title.setFont(new Font("Arial", Font.PLAIN, 30));
            textf = new JTextField();
            textf.setBounds(210,120,150,20);
            label = new JLabel();
            label.setBounds(160,270,250,20);
            label.setFont(new Font("Arial", Font.PLAIN, 15));
            label.setForeground(Color.BLUE);
            button = new JButton("Find IP Address");
            button.setBounds(200,220,180,30);
            button.addActionListener(this);
            frame = new JFrame("IP Address Lookup");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            frame.setSize(600,400);
            frame.setVisible(true);
            frame.setLayout(null);
            frame.add(title);
            frame.add(button);
            frame.add(textf);
            frame.add(label);
        }

        public void actionPerformed(ActionEvent e) {
            try {
                String host = textf.getText();
                String ip = java.net.InetAddress.getByName(host).getHostAddress();
                label.setText("IP of " + host + " is: " + ip);
            } catch(Exception ex){System.out.println(ex);}
        }

        public static void main(String[] args) {
            new LabelExample();
        }
} 
