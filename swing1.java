package Swing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public interface swing1 {

    static void main(){
        JFrame Jf =new JFrame();
        Jf.setTitle("First Window");
        Jf.setSize(500,600);
        Jf.setLocation(100,200);
        Jf.getContentPane().setLayout(new FlowLayout());
        JTextField text1 = new JTextField(20);
        JButton buton1=new JButton("Gönder") ;

        JLabel Label1=new JLabel();
        Label1.setText("Lütfen adınızı giriniz:");


        buton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label1.setText("Merhabalar "+text1.getText() + ", programa hoş geldin...");

            }

        });


        buton1.setBackground(Color.orange);
        text1.setBackground(Color.WHITE);
        text1.setFont(new Font("Calibri",Font.PLAIN,12));


        Jf.getContentPane().add(Label1);
        Jf.getContentPane().add(text1);
        Jf.getContentPane().add(buton1);







        Jf.setResizable(false);

        Jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Jf.setVisible(true);








    }


}
