public class Inimene {
    
   private String nimi, aadress;
   
   public Inimene(String nimi, String aadress) {
      this.nimi = nimi;
      this.aadress = aadress;
   }
   
   public String getNimi() {
      return nimi;
   }
   public String getAadress() {
      return aadress;
   }
   public void setAadress(String aadress) {
      this.aadress = aadress;
   }
   
   public String toString() {
      return nimi + "(" + aadress + ")";
   }
}