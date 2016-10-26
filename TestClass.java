public class TestClass {

   public static void main(String[] args) {
       
      /* Opilase klassi testimine */
      Opilane opilane1 = new Opilane("Tarvo Pikkaro", "Endla 6-3");
      opilane1.lisaKursusHinne("IM101", 97);
      opilane1.lisaKursusHinne("HKI5003", 68);
      opilane1.kuvaHinded();
      System.out.println("Keskmine hinne on " + opilane1.arvutaKeskmineHinne());
      
      /* Opetaja klassi testimine */
      Opetaja opetaja1 = new Opetaja("Jaagup Kippar", "Haapsalu Kolledž");
      System.out.println(opetaja1);
      String[] kursused = {"IM101", "HKI5003", "IM101"};
       
      for (String kursus: kursused) {
         if (opetaja1.lisaKursus(kursus)) {
            System.out.println(kursus + " lisatud kursustesse.");
         } else {
            System.out.println(kursus + " ei saanud lisada kursustesse.");
         }
      }
       
      for (String kursus: kursused) {
         if (opetaja1.kustutaKursus(kursus)) {
            System.out.println(kursus + " kustutati edukalt.");
         } else {
            System.out.println(kursus + " ei saa kustutada.");
         }
      }
   }
}