
import java.util.ArrayList;

public class Karakter {

    private String karakter_ad;
    private String tur;
    private Lokasyon lokasyon;

    public Karakter(String karakter_ad, String tur, Lokasyon lokasyon) {
        this.karakter_ad = karakter_ad;
        this.tur = tur;
        this.lokasyon = lokasyon;
    }

    public String getKarakter_ad() {
        return karakter_ad;
    }

    public void setKarakter_ad(String karakter_ad) {
        this.karakter_ad = karakter_ad;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public Lokasyon getLokasyon() {
        return lokasyon;
    }

    public void setLokasyon(Lokasyon lokasyon) {
        this.lokasyon = lokasyon;
    }

    public ArrayList<Point> EnKisaYol(int x, int y, int bulx, int buly) {

        return null;
    }

}
