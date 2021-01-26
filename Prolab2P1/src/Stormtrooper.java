
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Stormtrooper extends Karakter {

    static Queue<Point> q = new LinkedList<Point>();
    static int[][] arr = {
        {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0},
        {0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0},
        {0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0},
        {0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0},
        {0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0},
        {1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1},
        {0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0},
        {0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0},
        {0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0},
        {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},};

    public Stormtrooper(String karakter_ad, String tur, Lokasyon lokasyon) {
        super(karakter_ad, tur, lokasyon);
    }

    public ArrayList<Point> EnKisaYol(int x, int y, int bulx, int buly) {
        arr = new int[][]{
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0},
            {0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0},
            {1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1},
            {0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0},
            {0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        q.add(new Point(x, y, null));

        while (!q.isEmpty()) {
            Point p = q.remove();

            if (p.x == bulx && p.y == buly) {
                ArrayList<Point> nokta = new ArrayList<Point>();
                //System.out.println("Exit is reached!");
                while (p.getParent() != null) {
                    nokta.add(p);
                    p = p.getParent();

                }

                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                q.poll();
                System.out.println(nokta.size() - 1 + " adimda ulasir");
                return nokta;
            }

            if (isFree(p.x + 1, p.y, bulx, buly)) {
                arr[p.x][p.y] = -1;
                Point nextP = new Point(p.x + 1, p.y, p);
                q.add(nextP);
            }

            if (isFree(p.x - 1, p.y, bulx, buly)) {
                arr[p.x][p.y] = -1;
                Point nextP = new Point(p.x - 1, p.y, p);
                q.add(nextP);
            }

            if (isFree(p.x, p.y + 1, bulx, buly)) {
                arr[p.x][p.y] = -1;
                Point nextP = new Point(p.x, p.y + 1, p);
                q.add(nextP);
            }

            if (isFree(p.x, p.y - 1, bulx, buly)) {
                arr[p.x][p.y] = -1;
                Point nextP = new Point(p.x, p.y - 1, p);
                q.add(nextP);
            }

        }
        return null;

    }

    public static boolean isFree(int x, int y, int bulx, int buly) {
        if ((x >= 0 && x < arr.length) && (y >= 0 && y < arr[x].length) && (arr[x][y] == 1 || (x == bulx && y == buly))) {
            return true;
        }
        return false;
    }

}
