package Songtextsuche;

public class SongTextSearch {
    public static String getURL(String title, String interpret) {
        title = title.toLowerCase().replace(" ", "_");
        interpret = interpret.toLowerCase().replace(" ", "_");
        return "http://lyrics.wikia.com/api.php?func=getSong&artist=" + interpret + "&song=" + title;
    }
}