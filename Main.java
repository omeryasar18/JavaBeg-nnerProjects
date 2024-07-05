import javax.lang.model.element.Name;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {



    public static void main(String[] args) {
        String[] Rooms = new String[15];
        Scanner scanner = new Scanner(System.in);
        Rooms[1] = "Ömer Faruk Yaşar";
        Rooms[2] = "Arif Yaşar";
        Rooms[3] = "Ali Yaşar";
        Rooms[9] = "Mehmet Ali Yaşar";

        System.out.println("Merhaba lütfen adınızı giriniz:");
        String Name = scanner.nextLine();

        System.out.println("Merhaba lütfen Soyadınızı giriniz:");
        String Soyad = scanner.nextLine();
        Giris();
        while (true) {
            int RoomNumber = scanner.nextInt();
            if (Rooms[RoomNumber] != null) {
                System.out.println("This room has ocurred by somebody");
                System.out.println("Please enter a different number");
            } else {
                System.out.println("Enjoy your room!");
                break;
            }


        }






    }
    public static void Giris() {
        System.out.println("Merhaba "+ " otelimize hoş geldiniz!\n"
                + "Otelimiz 15 odaya sahiptir \n");
    }



}