
import java.util.ArrayList;
import java.util.Collections;

public class Darthvader extends Karakter {

    public Darthvader(String karakter_ad, String tur, Lokasyon lokasyon) {
        super(karakter_ad, tur, lokasyon);
    }

    public ArrayList<Point> EnKisaYol(int x, int y, int bulx, int buly) {
        ArrayList<Point> nokta = new ArrayList<Point>();

        int ydeger = y - buly;
        int xdeger = x - bulx;
        //ylerde pozitifse azalt negatifse arttir
        //xlerde pozitifse azalt negatifse arttir
        if (ydeger < 0 && xdeger < 0 || (xdeger == 0 || ydeger == 0)) {
            ydeger = ydeger * -1;
            xdeger = xdeger * -1;
            for (int i = 0; i < ydeger; i++) {
                Point p = new Point(x, y + i + 1, null);

                nokta.add(p);
            }
            for (int i = 0; i < xdeger; i++) {
                Point p = new Point(x + i + 1, y + ydeger, null);

                nokta.add(p);
            }
            Collections.reverse(nokta);
            System.out.println(nokta.size() - 1 + " adimda ulasir");
            return nokta;

        } else if (ydeger > 0 && xdeger > 0 || (xdeger == 0 || ydeger == 0)) {
            ydeger = ydeger * +1;
            xdeger = xdeger * +1;
            for (int i = 0; i < ydeger; i++) {
                Point p = new Point(x, y - i - 1, null);

                nokta.add(p);
            }
            for (int i = 0; i < xdeger; i++) {
                Point p = new Point(x - i - 1, y - ydeger, null);

                nokta.add(p);
            }
            Collections.reverse(nokta);
            System.out.println(nokta.size() - 1 + " adimda ulasir");
            return nokta;

        } else if (ydeger > 0 && xdeger < 0 || (xdeger == 0 || ydeger == 0)) {
            ydeger = ydeger * +1;
            xdeger = xdeger * -1;
            for (int i = 0; i < ydeger; i++) {
                Point p = new Point(x, y - i - 1, null);

                nokta.add(p);
            }
            for (int i = 0; i < xdeger; i++) {
                Point p = new Point(x + i + 1, y - ydeger, null);

                nokta.add(p);
            }
            Collections.reverse(nokta);
            System.out.println(nokta.size() - 1 + " adimda ulasir");
            return nokta;

        } else if (ydeger < 0 && xdeger > 0 || (xdeger == 0 || ydeger == 0)) {
            ydeger = ydeger * -1;
            xdeger = xdeger * +1;
            for (int i = 0; i < ydeger; i++) {
                Point p = new Point(x, y + i + 1, null);

                nokta.add(p);
            }
            for (int i = 0; i < xdeger; i++) {
                Point p = new Point(x - i - 1, y + ydeger, null);

                nokta.add(p);
            }
            Collections.reverse(nokta);
            System.out.println(nokta.size() - 1 + " adimda ulasir");
            return nokta;

        }

        return null;
    }

}
