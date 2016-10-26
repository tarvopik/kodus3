public class Opetaja extends Inimene {
    
   private int kursusteArv;   // opetatavate kursuste arv
   private String[] kursused; // kursuste koodid
   private static final int MAX_KURSUSTE_ARV = 5; // maksimaalne kursuste arv
   
   public Opetaja(String nimi, String aadress) {
      super(nimi, aadress);
      kursusteArv = 0;
      kursused = new String[MAX_KURSUSTE_ARV];
   }
   
   @Override
   public String toString() {
      return "Opetaja: " + super.toString();
   }
   
   // Kursuse lisamine.
   public boolean lisaKursus(String kursus) {
      // Kontrollime, kas kursus on juba olemas. Kui on, tagastame false
      for (int i = 0; i < kursusteArv; i++) {
         if (kursused[i].equals(kursus)) return false;
      }
      kursused[kursusteArv] = kursus;
      kursusteArv++;
      return true;
   }
   
   // Kursuse kustutamine
   public boolean kustutaKursus(String kursus) {
      boolean kursusLeitud = false;
      // Leiame kursuse indeksi, mille alusel saaksime kursuse kustutada
      int kursuseIndeks = -1;
      for (int i = 0; i < kursusteArv; i++) {
         if (kursused[i].equals(kursus)) {
            kursuseIndeks = i;
            kursusLeitud = true;
            break;
         }
      }
      if (kursusLeitud) {
         // Kustutame kursuse ja muudame array järjekorra õigeks
         for (int i = kursuseIndeks; i < kursusteArv-1; i++) {
            kursused[i] = kursused[i+1];
         }
         kursusteArv--;
         return true;
      } else {
         return false;
      }
   }
}