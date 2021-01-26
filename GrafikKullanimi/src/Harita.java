
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Harita extends JPanel implements KeyListener, ActionListener {

    Lokasyon iyilokasyon = new Lokasyon(5, 6);
    Lokasyon kotulokasyon = new Lokasyon(0, 12);
    LukeSkywalker lukeskywalker = new LukeSkywalker("lukseskywalker", "iyi", iyilokasyon, 3);
    MasterYoda masteryoda = new MasterYoda("masteryoda", "iyi", iyilokasyon, 3);
    Stormtrooper stormtrooper = new Stormtrooper("stormtrooper", "kotu", kotulokasyon);
    KyloRen kyloren = new KyloRen("kyloren", "kotu", kotulokasyon);
    Darthvader darthvader = new Darthvader("darthvader", "kotu", kotulokasyon);

    int[][] matris = {
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
    BufferedImage iyi_image;
    BufferedImage kotu_image;
    int secim;
    int iyi_x;
    int iyi_y;
    int kotu_x;
    int kotu_y;
    static ArrayList<Point> nokta;
    static ArrayList<Karakter> karakterler;

    public Harita(int secim, ArrayList<Karakter> karakterler) {
        this.karakterler = karakterler;
        this.secim = secim;
        kotu_x = karakterler.get(0).getLokasyon().getLokasyon_y();
        kotu_y = karakterler.get(0).getLokasyon().getLokasyon_x();

        if (secim == 1) {
            iyi_x = masteryoda.getLokasyon().getLokasyon_y();
            iyi_y = masteryoda.getLokasyon().getLokasyon_x();

        } else if (secim == 2) {
            iyi_x = lukeskywalker.getLokasyon().getLokasyon_y();
            iyi_y = lukeskywalker.getLokasyon().getLokasyon_x();
        }

        try {
            if (karakterler.get(0).getKarakter_ad() == "stormtrooper") {
                kotu_image = ImageIO.read(new FileImageInputStream(new File("stormtrooper.png")));

            }
            if (karakterler.get(0).getKarakter_ad() == "darthvader") {
                kotu_image = ImageIO.read(new FileImageInputStream(new File("darthvader.png")));

            }
            if (karakterler.get(0).getKarakter_ad() == "kyloren") {
                kotu_image = ImageIO.read(new FileImageInputStream(new File("kyloren.png")));

            }
        } catch (IOException ex) {
            Logger.getLogger(Harita.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (secim == 1) {
                iyi_image = ImageIO.read(new FileImageInputStream(new File("yoda.png")));
            }
        } catch (IOException ex) {
            Logger.getLogger(Harita.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (secim == 2) {
                iyi_image = ImageIO.read(new FileImageInputStream(new File("lukeskywalker.png")));
            }
        } catch (IOException ex) {
            Logger.getLogger(Harita.class.getName()).log(Level.SEVERE, null, ex);
        }
        Point s = new Point(-1, -1, null);

        this.nokta = new ArrayList<Point>();
        nokta.add(s);
        //nokta=karakterler.get(0).EnKisaYol(kotu_y,kotu_x,iyi_y,iyi_x);
        setBackground(Color.darkGray);

    }

    public ArrayList<Point> getNokta() {
        return nokta;
    }

    public void setNokta(ArrayList<Point> nokta) {
        this.nokta = nokta;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.

        // engel dizme              
        g.setColor(Color.red);
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 14; j++) {
                if (matris[i][j] == 0) {
                    g.fillRect(j * 40, i * 40, 40, 40);
                }

            }

        }

        /*
       //matris yazma 
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j]+"  "); 
            }
            System.out.println();
        }*/
        //nokta=stormtrooper.EnKisaYol(0,12,matris,5,6);
        //////////////////////////////////////////
        g.setColor(Color.blue);
        if (karakterler.get(0).getKarakter_ad().equalsIgnoreCase("kyloren")) {
            for (int i = 0; i < nokta.size() - 1; i++) {

                g.fillRect(nokta.get(i).y * 40, nokta.get(i).x * 40, 40, 40);

            }

        } else {
            for (int i = 0; i < nokta.size(); i++) {

                g.fillRect(nokta.get(i).y * 40, nokta.get(i).x * 40, 40, 40);

            }
        }

        //int x=nokta.get(nokta.size()-1).x;
        //int y=nokta.get(nokta.size()-1).y;
        //////////////////////////////////////////////
        g.setColor(Color.white);
        int cizgi = 0;
        for (int i = 0; i < 15; i++) {
            g.drawLine(0 + cizgi, 0, 0 + cizgi, 440);
            //g.drawLine(0, 0+cizgi, 220, 0+cizgi);
            cizgi = cizgi + 40;
        }
        cizgi = 0;
        for (int i = 0; i < 12; i++) {
            // g.drawLine(0+cizgi, 0, 0+cizgi, 480);
            g.drawLine(0, 0 + cizgi, 560, 0 + cizgi);
            cizgi = cizgi + 40;
        }

        /* g.setColor(Color.orange);
        g.fillOval(x, y, 30,30);
        
         g.setColor(Color.green);
        g.drawLine(x+15, y+15, x2+15, y2+15);
        g.setColor(Color.red);
        g.fillRect(0 ,0,40,40); 
        
        
        g.setColor(Color.yellow);
         */
 /*g.setColor(Color.red);
        for (int i = 0; i < engel_sayisi; i++) {
                 g.fillRect((array[i][0]-1)*30,(array[i][1]-1)*30 , 30,30);   
                    
            
        }*/
        //g.fillOval((i-1)*30+10,(i-1)*30+10 , 30,30);
        g.drawImage(iyi_image, iyi_x * 40, iyi_y * 40, iyi_image.getWidth() / 7, iyi_image.getHeight() / 7, this);
        g.drawImage(kotu_image, kotu_x * 40, kotu_y * 40, kotu_image.getWidth() / 7, kotu_image.getHeight() / 7, this);

        if (new Rectangle(9 * 40, 13 * 40, 40, 40).intersects(new Rectangle(iyi_y * 40, iyi_x * 40, 40, 40))) {
            JOptionPane.showMessageDialog(this, "Tebrikler Kazandiniz");

            System.exit(0);

        }
        if (new Rectangle(kotu_y * 40, kotu_x * 40, 40, 40).intersects(new Rectangle(iyi_y * 40, iyi_x * 40, 40, 40))) {
            System.out.println("yakalandin kekeoooooo");
            /*try {
             Thread.sleep(1000);
         } catch (InterruptedException ex) {
             Logger.getLogger(Harita.class.getName()).log(Level.SEVERE, null, ex);
         }
           
           kotu_x=kyloren.getLokasyon().getLokasyon_y();
          kotu_y=kyloren.getLokasyon().getLokasyon_x();
          iyi_x=masteryoda.getLokasyon().getLokasyon_y();
          iyi_y=masteryoda.getLokasyon().getLokasyon_x();
          //System.out.println(secim);*/

            if (secim == 1) {
                masteryoda.setCan(masteryoda.getCan() - 0.5);
                System.out.println(masteryoda.getCan() + " canin kaldi");
                kotu_x = karakterler.get(0).getLokasyon().getLokasyon_y();
                kotu_y = karakterler.get(0).getLokasyon().getLokasyon_x();
                iyi_x = masteryoda.getLokasyon().getLokasyon_y();
                iyi_y = masteryoda.getLokasyon().getLokasyon_x();
                nokta = karakterler.get(0).EnKisaYol(kotu_y, kotu_x, iyi_y, iyi_x);
                repaint();

                if (masteryoda.getCan() == 0) {

                    JOptionPane.showMessageDialog(this, "GAME OVER");

                    System.exit(0);

                }
            }
            if (secim == 2) {
                lukeskywalker.setCan(lukeskywalker.getCan() - 1);
                System.out.println(lukeskywalker.getCan() + " canin kaldi");
                kotu_x = karakterler.get(0).getLokasyon().getLokasyon_y();
                kotu_y = karakterler.get(0).getLokasyon().getLokasyon_x();
                iyi_x = lukeskywalker.getLokasyon().getLokasyon_y();
                iyi_y = lukeskywalker.getLokasyon().getLokasyon_x();
                nokta = karakterler.get(0).EnKisaYol(kotu_y, kotu_x, iyi_y, iyi_x);
                repaint();

                if (lukeskywalker.getCan() == 0) {

                    JOptionPane.showMessageDialog(this, "GAME OVER");

                    System.exit(0);

                }
            }
            /* masteryoda.setCan(masteryoda.getCan()-1);
          if(masteryoda.getCan()==0){
              
              JOptionPane.showMessageDialog(this, "GAME OVER");
              System.exit(0);
              
          }
          System.out.println(secim);
          
             */
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int x = e.getKeyCode();

        if (x == KeyEvent.VK_LEFT) {

            iyi_x = iyi_x - 1;

            for (int i = 0; i < matris.length; i++) {
                for (int j = 0; j < matris[0].length; j++) {
                    if (matris[i][j] == 0 && iyi_x == j && iyi_y == i || iyi_x < 0 || iyi_x > 13 || iyi_y < 0 || iyi_y > 10) {
                        iyi_x = iyi_x + 1;
                    }

                }

            }

            nokta = karakterler.get(0).EnKisaYol(kotu_y, kotu_x, iyi_y, iyi_x);

            if (karakterler.get(0).getKarakter_ad().equalsIgnoreCase("kyloren")) {
                kotu_x = nokta.get(nokta.size() - 2).y;
                kotu_y = nokta.get(nokta.size() - 2).x;

            } else {
                kotu_x = nokta.get(nokta.size() - 1).y;
                kotu_y = nokta.get(nokta.size() - 1).x;

            }

            repaint();

        } else if (x == KeyEvent.VK_RIGHT) {
            iyi_x = iyi_x + 1;
            for (int i = 0; i < matris.length; i++) {
                for (int j = 0; j < matris[0].length; j++) {
                    if (matris[i][j] == 0 && iyi_x == j && iyi_y == i || iyi_x < 0 || iyi_x > 13 || iyi_y < 0 || iyi_y > 10) {
                        iyi_x = iyi_x - 1;
                    }

                }

            }

            nokta = karakterler.get(0).EnKisaYol(kotu_y, kotu_x, iyi_y, iyi_x);

            if (karakterler.get(0).getKarakter_ad().equalsIgnoreCase("kyloren")) {
                kotu_x = nokta.get(nokta.size() - 2).y;
                kotu_y = nokta.get(nokta.size() - 2).x;

            } else {
                kotu_x = nokta.get(nokta.size() - 1).y;
                kotu_y = nokta.get(nokta.size() - 1).x;

            }

            repaint();

        } else if (x == KeyEvent.VK_UP) {
            iyi_y = iyi_y - 1;
            for (int i = 0; i < matris.length; i++) {
                for (int j = 0; j < matris[0].length; j++) {
                    if (matris[i][j] == 0 && iyi_x == j && iyi_y == i || iyi_x < 0 || iyi_x > 13 || iyi_y < 0 || iyi_y > 10) {
                        iyi_y = iyi_y + 1;
                    }

                }

            }

            nokta = karakterler.get(0).EnKisaYol(kotu_y, kotu_x, iyi_y, iyi_x);

            if (karakterler.get(0).getKarakter_ad().equalsIgnoreCase("kyloren")) {
                kotu_x = nokta.get(nokta.size() - 2).y;
                kotu_y = nokta.get(nokta.size() - 2).x;

            } else {
                kotu_x = nokta.get(nokta.size() - 1).y;
                kotu_y = nokta.get(nokta.size() - 1).x;

            }

            repaint();

        } else if (x == KeyEvent.VK_DOWN) {
            iyi_y = iyi_y + 1;
            for (int i = 0; i < matris.length; i++) {
                for (int j = 0; j < matris[0].length; j++) {
                    if (matris[i][j] == 0 && iyi_x == j && iyi_y == i || iyi_x < 0 || iyi_x > 13 || iyi_y < 0 || iyi_y > 10) {
                        iyi_y = iyi_y - 1;
                    }

                }

            }

            nokta = karakterler.get(0).EnKisaYol(kotu_y, kotu_x, iyi_y, iyi_x);

            if (karakterler.get(0).getKarakter_ad().equalsIgnoreCase("kyloren")) {
                kotu_x = nokta.get(nokta.size() - 2).y;
                kotu_y = nokta.get(nokta.size() - 2).x;

            } else {
                kotu_x = nokta.get(nokta.size() - 1).y;
                kotu_y = nokta.get(nokta.size() - 1).x;

            }

            repaint();

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }

}
