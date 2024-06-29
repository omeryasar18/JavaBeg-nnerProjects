package Swing;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;

public class Swing2 {
    public static void main(String[] args) {
        int Vize1, Vize2,Final1;

        String sVize1 = JOptionPane.showInputDialog("Lütfen 1. vize notunuzu giriniz...");
        Vize1 = Integer.parseInt(sVize1);
        while (Vize1>100||Vize1<0){
            sVize1 = JOptionPane.showInputDialog(null,"Lütfen 1. vize notunuzu giriniz...","1.Vize",JOptionPane.WARNING_MESSAGE);
            Vize1 = Integer.parseInt(sVize1);

        }

        String sVize2=JOptionPane.showInputDialog("Lütfen 2. vize notunuzu giriniz...");
        Vize2=Integer.parseInt(sVize2);

        while(Vize2>100||Vize2<0){
            sVize2 = JOptionPane.showInputDialog(null,"Lütfen 2. vize notunuzu giriniz...","2.Vize",JOptionPane.WARNING_MESSAGE);
            Vize2 = Integer.parseInt(sVize1);
        }
        String sFinal1=JOptionPane.showInputDialog("Lutfen final notunuzu giriniz...");
        Final1=Integer.parseInt(sFinal1);


        while (Final1>100||Final1<0){

            sFinal1 = JOptionPane.showInputDialog(null,"Lütfen Final  notunuzu giriniz...","Final Notu",JOptionPane.WARNING_MESSAGE);
            Final1 = Integer.parseInt(sFinal1);
        }

        double Result=((Vize1+Vize2)/2)*0.4+ (Final1)*0.6;
        String mesaj;
        if (Result>55&&Result<70){
            mesaj="Tebrikler C İle geçtiniz, geçme notunuz:"+ Result;
        }
        else if (Result>70&&Result<80) {
            mesaj="Tebrikler B ile geçtiniz, geçme notunuz: "+Result;
        }
        else if (Result>80&&Result<90) {
            mesaj="Tebrikler B+ ile geçtiniz, geçme notunuz:"+Result;
        }
        else if (Result>90&&Result<100) {
            mesaj="Tebrikler A ile geçtiniz,geçme notunuz:" +Result;
        }
        else {
            mesaj="BAŞARISIZ F ile kaldınız. BN:"+Result;
        }

        ImageIcon IconCan =new ImageIcon("C:\\Users\\Excalibur\\OneDrive\\esimler\\Masaüstü\\BELGELER\\png-transparent-check-mark-computer-icons-icon-design-cheque-successful-angle-logo-grass-thumbnail.png");
       JOptionPane.showMessageDialog(null,mesaj,"Sonuç Açıklandı",JOptionPane.INFORMATION_MESSAGE,IconCan);

    }

}
