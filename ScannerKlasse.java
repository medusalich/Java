/*Erstelle ein Programm, das mithilfe der Scanner-Klasse einen Text entgegennimmt 
und diesen dann in der Konsole ausgibt.*/

import java.util.Scanner;

public class ScannerKlasse {

    public static void main(String[] args) {
        try (Scanner meineEingabe = new Scanner(System.in)) {
            System.out.println("Gib bitte einen Text ein: ");
            String eingegebenerText = meineEingabe.nextLine();
            System.out.println("Es wurde folgendes eingegeben: " + eingegebenerText);
        }
    }

}
