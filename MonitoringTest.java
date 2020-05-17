

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MonitoringTest.
 *
 * @author  (Jinyang Zhou)
 * @version (09/11/2019)
 */
public class MonitoringTest
{
    /**
     * Default constructor for test class MonitoringTest
     */ 
     Observatory ob1 = new Observatory(1997,11.10,"Tokyo");
     Observatory ob2 = new Observatory(1997,90.06,"Newyork");
     Observatory ob3 = new Observatory(2019,51.10,"London");
     earthquake   earthquake1 = new earthquake(35.1532,54.4512,1997,5.0);
     earthquake   earthquake2 = new earthquake(45.6240,12.1451,1998,5.5);
     earthquake   earthquake3 = new earthquake(1.0,1.0,1999,6.0);
     earthquake   earthquake4 = new earthquake(0511,0724,2000,6.5);
     earthquake   earthquake5 = new earthquake(221.2,152.1,2001,6.6);
     earthquake   earthquake6 = new earthquake(124.5,251.2,2002,7.0);
     earthquake   earthquake7 = new earthquake(124.65,11.23,2003,7.1);
     earthquake   earthquake8 = new earthquake(144.3,66.2,2004,8.8);
     Monitoring grandpa     = new Monitoring();
     
    public MonitoringTest()
    {
        grandpa.addOb(ob1);
        grandpa.addOb(ob2);
        grandpa.addOb(ob3);
        ob1.addChild(earthquake1);
        ob1.addChild(earthquake2);
        ob1.addChild(earthquake3);
        ob1.addChild(earthquake4);
        ob2.addChild(earthquake5);
        ob2.addChild(earthquake6);
        ob2.addChild(earthquake7);
        ob2.addChild(earthquake8);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {

        System.out.println("Create three observatories.");
        

       
    }
    @Test
    public void testMaxEarthquake()
    {   
        
        assertEquals(grandpa.getMaxE(),earthquake8);//System.out.println("The biggest earthquake ever:");
       // grandpa.getMaxE().Information();
        
     //   assertEquals(     
    }
    @Test
    public void testGivenNumber()
    {   double a = 6.0;
        System.out.println("Earthquakes greater than magnitude 6.");
        grandpa.getList(a);
    }
    
        
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        System.out.println("The test is completed.");
    }
}
