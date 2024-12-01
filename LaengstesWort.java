//Suchen innerhalb eines übergebenen Textes das längste Wort herraus.

public class LaengstesWort {

    public static String findeLaengstesWort(String text) {
        String[] woerter = text.replaceAll("[^a-zA-ZäöüÄÖÜß]", " ").split("\\s+");
        String laengstesWort = "";

        for (String wort : woerter) {
            if (wort.length() > laengstesWort.length()) {
                laengstesWort = wort;
            }
        }
        return laengstesWort;
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

        String laengstesWort = findeLaengstesWort(text);
        System.out.println("Das längste Wort lautet: " + laengstesWort);
    }

}
