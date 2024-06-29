package Swing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public interface Swing3 {

    public class NewWindow extends JFrame{
        public NewWindow(){
            setTitle("New Window");
            setSize(500,500);
            setLocation(100,200);
            JButton Button2 = new JButton("SEND");
            JTextField Text2 = new JTextField(35);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            JLabel Label2 = new JLabel();
            Label2.setText("Whhat is your father's name?");



            add(Label2);

        }
    }


    public static void main(){
        JFrame Jf=new JFrame();
        Jf.setTitle("Main Page");
        Jf.setSize(500,500);
        Jf.setLocation(100,200);
        Jf.getContentPane().setLayout(new FlowLayout());
        JTextField Text1 =new JTextField(35);
        JButton Button1= new JButton("Send");
        JLabel Label1 = new JLabel();
        Label1.setText("Please enter your name");

        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label1.setText("Hello, "+ Text1.getText() +" Welcome to the page");
                NewWindow newWindow = new NewWindow();
                newWindow.setVisible(true);
                Label1.setVisible(false);


            }

        });







        Jf.getContentPane().add(Label1);
      //  Jf.getContentPane().add(Label2);
        //Jf.getContentPane().add(Text2);
        Jf.getContentPane().add(Text1);
        Jf.getContentPane().add(Button1);




        Jf.setResizable(false);


        Jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Jf.setVisible(true);






    }







}
