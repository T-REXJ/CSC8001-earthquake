

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ObservatoryTest.
 *
 * @author  (Jinyang Zhou)
 * @version (09/11/2019)
 */
public class ObservatoryTest
{
    /**
     * Default constructor for test class ObservatoryTest
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
     
    public ObservatoryTest()
    {
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
      System.out.println("Three observatories are set up. Observatories 1 store four earthquakes, observatories 2 store four earthquakes, and observatories 3 are empty.");
    }

    @Test
    public void testName()
    {    
        assertEquals("Tokyo",ob1.name);
        assertEquals("Newyork",ob2.name);
        assertEquals("London",ob3.name);
        System.out.println("Name is true!");
    }
    
     @Test
    public void testMaxMagnitude()
    {   
        
       
        assertEquals(ob1.Max(),earthquake4);
        assertEquals(ob2.Max(),earthquake8);
        
       // assertEquals(ob3.Max(),null);
        System.out.println("The Max earthquake Judge success. ");
        System.out.println("And the " + ob1.name+ " observatory's max earthquake is  ");
        ob1.Max().Information();
        System.out.println("And the " + ob2.name+ " observatory's max earthquake is  ");
        ob2.Max().Information();
    }
     @Test
    public void testAverageMagnitude()
    {  
        assertEquals(5.75,ob1.Average(),0.01);
        assertEquals(ob2.Average(),7.375,0.01);
        System.out.println("And the " + ob1.name+ " observatory's Avearge earthquake is " +ob1.Average());
        System.out.println("And the " + ob2.name+ " observatory's Avearge earthquake is " +ob2.Average());
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
