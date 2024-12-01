//Nimm einen Text, zähle die Anzahl der Worte und gib die Anzahl in einer Ausgabe zurück.

public class WortZaehler {

    public static int zaehleWoerter(String text) {
        String[] wörter = text.trim().split("\\s+");
        return wörter.length;
    }

    public static void main(String[] args) {
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
        System.out.println(text);

        int wortAnzahl = zaehleWoerter(text);
        System.out.println("Die Anzahl der Worte im Text beträgt: " + wortAnzahl);

    }

}
