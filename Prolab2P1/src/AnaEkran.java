
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

//Aziz Yelbay 170201046-Onur KUS 170201030
public class AnaEkran extends JFrame {

    public AnaEkran(String title) throws HeadlessException {
        super(title);
    }

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        //dosya okuma
        ArrayList<String> dosya = new ArrayList<String>();
        try (Scanner scanner = new Scanner(new FileReader("harita.txt"))) {

            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                dosya.add(s);

            }

        } catch (FileNotFoundException ex) {
            System.out.println("dosya bulunamadi");

        } catch (IOException ex) {
            System.out.println("dosya acilirken bir hata olustu");

        }
        //System.out.println(dosya.size());
        //dosyadakileri matrise yazma
        ArrayList<Karakter> karakterler = new ArrayList<Karakter>();

        int[][] matris = new int[11][14];
        int m = 0;

        for (int i = 0; i < dosya.size(); i++) {
            if (dosya.get(i).contains("Karakter")) {

                if (dosya.get(i).contains("Darthvader")) {

                    if (dosya.get(i).contains("A")) {
                        Lokasyon kotulokasyon = new Lokasyon(5, 0);
                        Darthvader darthvader = new Darthvader("darthvader", "kotu", kotulokasyon);
                        karakterler.add(darthvader);

                    } else if (dosya.get(i).contains("B")) {
                        Lokasyon kotulokasyon = new Lokasyon(0, 4);
                        Darthvader darthvader = new Darthvader("darthvader", "kotu", kotulokasyon);
                        karakterler.add(darthvader);

                    } else if (dosya.get(i).contains("C")) {
                        Lokasyon kotulokasyon = new Lokasyon(0, 12);
                        Darthvader darthvader = new Darthvader("darthvader", "kotu", kotulokasyon);
                        karakterler.add(darthvader);
                    } else if (dosya.get(i).contains("D")) {
                        Lokasyon kotulokasyon = new Lokasyon(5, 13);
                        Darthvader darthvader = new Darthvader("darthvader", "kotu", kotulokasyon);
                        karakterler.add(darthvader);
                    } else if (dosya.get(i).contains("E")) {
                        Lokasyon kotulokasyon = new Lokasyon(10, 4);
                        Darthvader darthvader = new Darthvader("darthvader", "kotu", kotulokasyon);
                        karakterler.add(darthvader);
                    }

                }

                if (dosya.get(i).contains("Stormtrooper")) {

                    if (dosya.get(i).contains("A")) {
                        Lokasyon kotulokasyon = new Lokasyon(5, 0);
                        Stormtrooper stormtrooper = new Stormtrooper("stormtrooper", "kotu", kotulokasyon);
                        karakterler.add(stormtrooper);

                    } else if (dosya.get(i).contains("B")) {
                        Lokasyon kotulokasyon = new Lokasyon(0, 4);
                        Stormtrooper stormtrooper = new Stormtrooper("stormtrooper", "kotu", kotulokasyon);
                        karakterler.add(stormtrooper);

                    } else if (dosya.get(i).contains("C")) {
                        Lokasyon kotulokasyon = new Lokasyon(0, 12);
                        Stormtrooper stormtrooper = new Stormtrooper("stormtrooper", "kotu", kotulokasyon);
                        karakterler.add(stormtrooper);
                    } else if (dosya.get(i).contains("D")) {
                        Lokasyon kotulokasyon = new Lokasyon(5, 13);
                        Stormtrooper stormtrooper = new Stormtrooper("stormtrooper", "kotu", kotulokasyon);
                        karakterler.add(stormtrooper);
                    } else if (dosya.get(i).contains("E")) {
                        Lokasyon kotulokasyon = new Lokasyon(10, 4);
                        Stormtrooper stormtrooper = new Stormtrooper("stormtrooper", "kotu", kotulokasyon);
                        karakterler.add(stormtrooper);
                    }

                }

                if (dosya.get(i).contains("KyloRen")) {

                    if (dosya.get(i).contains("A")) {
                        Lokasyon kotulokasyon = new Lokasyon(5, 0);
                        KyloRen kyloren = new KyloRen("kyloren", "kotu", kotulokasyon);
                        karakterler.add(kyloren);

                    } else if (dosya.get(i).contains("B")) {
                        Lokasyon kotulokasyon = new Lokasyon(0, 4);
                        KyloRen kyloren = new KyloRen("kyloren", "kotu", kotulokasyon);
                        karakterler.add(kyloren);

                    } else if (dosya.get(i).contains("C")) {
                        Lokasyon kotulokasyon = new Lokasyon(0, 12);
                        KyloRen kyloren = new KyloRen("kyloren", "kotu", kotulokasyon);
                        karakterler.add(kyloren);
                    } else if (dosya.get(i).contains("D")) {
                        Lokasyon kotulokasyon = new Lokasyon(5, 13);
                        KyloRen kyloren = new KyloRen("kyloren", "kotu", kotulokasyon);
                        karakterler.add(kyloren);
                    } else if (dosya.get(i).contains("E")) {
                        Lokasyon kotulokasyon = new Lokasyon(10, 4);
                        KyloRen kyloren = new KyloRen("kyloren", "kotu", kotulokasyon);
                        karakterler.add(kyloren);
                    }

                }

            } else {
                String[] ayir = dosya.get(i).split("\t");
                for (int j = 0; j < ayir.length; j++) {
                    matris[m][j] = Integer.parseInt(ayir[j]);

                }
                m++;
            }

        }

        /*for (int i = 0; i < 11; i++) {
            for (int j = 0; j <14; j++) {
                System.out.print(" "+matris[i][j]);
                
            }
              System.out.println("");
        }    */
        //kotu karakter bilgileri
        /*System.out.println(karakterler.size());
                for (int i = 0; i < karakterler.size(); i++) {
                    System.out.println(karakterler.get(i).getKarakter_ad()+"  "+karakterler.get(i).getTur()+"  "+karakterler.get(i).getLokasyon().getLokasyon_x()+"  "+karakterler.get(i).getLokasyon().getLokasyon_y());
            
        }*/
 /*
        //matrisi ekrana yazdirma
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j <14; j++) {
                System.out.print(" "+matris[i][j]);
                
            }
              System.out.println("");
        }    
    
        
        //ekran acma
        
        
       /* AnaEkran ekran = new AnaEkran("Mr Robot");
        
        Lokasyon grafik = new Lokasyon(matris);
        
        ekran.setVisible(true);
        ekran.setResizable(true);
        ekran.setSize(580,480);
         
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ekran.add(grafik);
         */
        int secim;

        while (true) {
            System.out.println("1-MasterYoda\n2-LukeSkywalker");
            secim = klavye.nextInt();
            if (secim == 1) {
                break;
            } else if (secim == 2) {

                break;
            } else {
                System.out.println("gecersiz islem");
            }

        }

        int[][] matris1 = matris;

        ////////////////////////////
        /* Lokasyon kotulokasyon=new Lokasyon(0,12);
        Stormtrooper stormtrooper=new Stormtrooper("stormtrooper","kotu",kotulokasyon );
       ;
      // DarthVader darthvader =new DarthVader ("darthvader","kotu",kotulokasyon);
ArrayList <Point> nokta= Stormtrooper.EnKisaYol(0,12,5,6);
       
       
       
    
        System.out.println("adim sayisi nda bulur==="+nokta.size());
      
        for (int i = 0; i < nokta.size(); i++) {
            System.out.println(nokta.get(i).x+"  "+nokta.get(i).y);
        
        
              
                
             
        
        
        
        }*/
        ////////////////////////////////////////////
        AnaEkran ekran = new AnaEkran("Star Wars");

        ekran.setResizable(false);
        ekran.setFocusable(false);
        ekran.setSize(570, 470);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Harita grafik = new Harita(secim, karakterler);
        grafik.requestFocus();
        grafik.addKeyListener(grafik);
        grafik.setFocusable(true);
        grafik.setFocusTraversalKeysEnabled(false);
        ekran.add(grafik);
        ekran.setVisible(true);

    }

}
