//Finde ein bestimmtes Wort in einem Text und gib dessen Position zurück oder melde, wenn es nicht vorhanden ist.

import java.util.Scanner;

public class WortFinder {
    
    public static void main(String[] args) {

        try (Scanner meineEingabe = new Scanner(System.in)) {
            String text = "Hallo. Ich bin ein kleiner Blindtext. Und zwar schon so lange ich denken kann. "
                    + "Es war nicht leicht zu verstehen, was es bedeutet, ein blinder Text zu sein: "
                    + "Man ergibt keinen Sinn. Wirklich keinen Sinn. Man wird zusammenhangslos "
                    + "eingeschoben und rumgedreht – und oftmals gar nicht erst gelesen. "
                    + "Aber bin ich allein deshalb ein schlechterer Text als andere? "
                    + "Na gut, ich werde nie in den Bestsellerlisten stehen. "
                    + "Aber andere Texte schaffen das auch nicht. "
                    + "Und darum stört es mich nicht besonders blind zu sein. "
                    + "Und sollten Sie diese Zeilen noch immer lesen, so habe ich als kleiner "
                    + "Blindtext etwas geschafft, wovon all die richtigen und wichtigen Texte "
                    + "meist nur träumen.";

            System.out.print("Welches Wort wird gesucht: ");
            String suchWort = meineEingabe.nextLine();

            int position = text.indexOf(suchWort);

            if (position != -1) {
                System.out.println("Das Wort '" + suchWort + "' wurde an der Position: " + position + " gefunden");
            } else {
                System.out.println("Das Wort '" + suchWort + "' wurde nicht gefunden.");
            }
        }
    }

}