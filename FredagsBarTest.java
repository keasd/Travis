import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class FredagsBarTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void defaultTest() {
      FredagsBar fb = new FredagsBar("TestBar");
      fb.setAntalSodavand(24);
      fb.setPrisSodavand(12.0);
      fb.setErAaben(true);
      Assert.assertTrue("Test get & set erAaben", fb.getErAaben());
   }
}
