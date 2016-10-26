public class Opilane extends Inimene {
   private int kursusteArv;   // l2bitud kursuste arv
   private String[] kursused; // kursuste koodid
   private int[] hinded;     // kursuste hinded
   private static final int MAX_KURSUSTE_ARV = 30; // maksimum kursuste arv
   
   public Opilane(String nimi, String aadress) {
      super(nimi, aadress);
      kursusteArv = 0;
      kursused = new String[MAX_KURSUSTE_ARV];
      hinded = new int[MAX_KURSUSTE_ARV];
   }
   
   @Override
   public String toString() {
      return "Opilane: " + super.toString();
   }
   
   // Kursuse ja kursuse hinde lisamine
   public void lisaKursusHinne(String kursus, int hinne) {
      kursused[kursusteArv] = kursus;
      hinded[kursusteArv] = hinne;
      ++kursusteArv;
   }
   
   // Kuva k6ik v6etud kursused ja nende hinded
   public void kuvaHinded() {
      System.out.print(this);
      for (int i = 0; i < kursusteArv; ++i) {
         System.out.print(" " + kursused[i] + ":" + hinded[i]);
      }
      System.out.println();
   }
   
   // Keskmise hinde arvutamine
   public double arvutaKeskmineHinne() {
      int summa = 0;
      for (int i = 0; i < kursusteArv; i++ ) {
         summa += hinded[i];
      }
      return (double)summa/kursusteArv;
   }
}