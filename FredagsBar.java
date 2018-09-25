public class FredagsBar
{
   //attributer
   private int antalOel;
   private int antalSodavand;
   private double prisOel;
   private double prisSodavand;
   private String navn;
   private boolean erAaben;
   
   //konstruktører
   public FredagsBar()
   {
      this.antalOel = 0;
      this.antalSodavand = 0;
      this.prisOel = 0.0;
      this.prisSodavand = 0.0;
      this.navn = "";
      this.erAaben = false;
   }
   
   public FredagsBar(String navnPaaNyBar)
   {
      this.navn = navnPaaNyBar;
      this.antalOel = 0;
      this.antalSodavand = 0;
      this.prisOel = 0.0;
      this.prisSodavand = 0.0;
      this.erAaben = false;
   }
   
   //get/set metoder
   public void setErAaben(boolean aaben)
   {
      this.erAaben = aaben;
   }
   
   public boolean getErAaben()
   {
      return this.erAaben;
   }
   
   public void setAntalSodavand(int antalSodavand)
   {
      this.antalSodavand = antalSodavand;
   }
   
   public void setPrisSodavand(double prisSodavand)
   {
      this.prisSodavand = prisSodavand;
   }
   
   //metoder
   public void reklame()
   {
      //reklamer for FredagsBaren
      System.out.println("Fredagsbar: " + this.navn);
      System.out.println("Der er " + this.antalSodavand + " sodavand");
      System.out.println("En sodavand koster " + this.prisSodavand + " kr.");
      
      if (erAaben)
      {
         System.out.println("Baren er åben!");
      }
      else
      {
         System.out.println("Baren er lukket.");
      }
      
   }
}