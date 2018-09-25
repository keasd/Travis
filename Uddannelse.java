public class Uddannelse
{
   public static void main(String[] args)
   {
      //lav instans af FredagsBar
      FredagsBar minFredagsBar = new FredagsBar("Dat18c's fantastiske fredagsbar");
      
      //reklamer
      minFredagsBar.reklame();
      
      //sæt priser og antal
      minFredagsBar.setAntalSodavand(24);
      minFredagsBar.setPrisSodavand(12.5);
      
      
      //Vi går i fredagsbar hvis den er åben
      boolean aaben;
      aaben = minFredagsBar.getErAaben();
      if (aaben)
      {
         System.out.println("Vi går i baren!");
      }
      else
      {
         //lukket - øv
         System.out.println("Øv!");
      }
      
      //åben fredagsbaren
      minFredagsBar.setErAaben(true);
      
      //reklamer
      minFredagsBar.reklame();
      
      //Vi går i fredagsbar hvis den er åben
      aaben = minFredagsBar.getErAaben();
      if (aaben)
      {
         System.out.println("Vi går i baren!");
      }
      else
      {
         //lukket - øv
         System.out.println("Øv!");
      }
   }
}