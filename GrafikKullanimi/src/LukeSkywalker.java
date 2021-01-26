
public class LukeSkywalker extends Karakter{
    private int can;

    public LukeSkywalker(String karakter_ad, String tur, Lokasyon lokasyon,int can) {
        super(karakter_ad, tur, lokasyon);
        this.can=3;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }
    
    
}
