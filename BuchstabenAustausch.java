//Ersetzte in einer Eingabe die Buchstaben (m, n, e) durch andere Buchstaben

import java.util.Scanner;

public class BuchstabenAustausch {

    public static void main(String[] args) {
        try (Scanner meineEingabe = new Scanner(System.in)) {
            System.out.print("Gib bitte einen Text ein: ");
            String eingabeText = meineEingabe.nextLine();

            String eingegebenerText = eingabeText
                    .replace("m", "w")
                    .replace("n", "a")
                    .replace("e", "s");

            System.out.println("Buchstaben umgewandelt: " + eingegebenerText);
        }
    }

}
