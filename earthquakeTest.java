
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class earthquakeTest.
 *
 * @author  (Jinyang Zhou)
 * @version (09/11/2019)
 */
public class earthquakeTest
{
    /**
     * Default constructor for test class earthquakeTest
     */
     earthquake earthquake1;//= new earthquake(35.1532,54.4512,1997,5.0);
     earthquake earthquake2;
     earthquake earthquake3;
     earthquake earthquake4;
     earthquake earthquake5;
     earthquake earthquake6;
     earthquake earthquake7;
     earthquake earthquake8;
    
    public earthquakeTest()
    {
        earthquake1 = new earthquake(35.1532,54.4512,1997,5.0);
        earthquake2 = new earthquake(45.6240,12.1451,1998,5.5);
        earthquake3 = new earthquake(1.0,1.0,1999,6.0);
        earthquake4 = new earthquake(0511,0724,2000,6.5);
        earthquake5 = new earthquake(221.2,152.1,2001,6.6);
        earthquake6 = new earthquake(124.5,251.2,2002,7.0);
        earthquake7 = new earthquake(124.65,11.23,2003,7.1);
        earthquake8 = new earthquake(144.3,66.2,2004,8.8);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {   System.out.println("Create eight earthquakes.");

        
        
    }
    
    @Test
    public void testInformation()
    {
 
        
        
    }
       /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        System.out.println("Has been created.");
    }
}
