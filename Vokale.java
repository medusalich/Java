//Bearbeiten eine Texteingabe so, dass keine Vokale mehr darin auftauchen.

import java.util.Scanner;

public class Vokale {

    public static void main(String[] args) {
        try (Scanner meineEingabe = new Scanner(System.in)) {
            System.out.print("Gib bitte einen Text ein: ");
            String eingabeText = meineEingabe.nextLine();
            
            String eingegebenerText = eingabeText.replaceAll("[aeiouAEIOU]", "");
            System.out.println("Text Ausgabe ohen Vokale: " + eingegebenerText);
        }
    }

}
