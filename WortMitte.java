/*Erweitere eine Methode, die den Buchstaben in der Mitte eines Wortes zurückgibt, 
wobei bei gerader Länge beide mittigen Buchstaben ausgegeben werden.*/

public class WortMitte {

    public static String wortZeichenMitte(String wort) {
        int laenge = wort.length();
        int mitteIndex = laenge / 2;

        if (laenge % 2 == 0) {
            return wort.substring(mitteIndex - 1, mitteIndex + 1);
        } else {
            return wort.substring(mitteIndex, mitteIndex + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(wortZeichenMitte("Kekse"));
        System.out.println(wortZeichenMitte("Kuchen"));
    }

}
