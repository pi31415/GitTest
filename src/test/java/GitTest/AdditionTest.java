package GitTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created with IntelliJ IDEA.
 * User: peter
 * Date: 11/23/12
 * Time: 2:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class AdditionTest extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AdditionTest( String testName )
    {
        super(testName);
    }


    /**
     * Rigourous Test :-)
     */
    public void testAddition1()
    {
        Addition addition = new Addition();
        assertEquals((2+1), addition.addTwoNumbers(2,1));
    }


    /**
     * Rigourous Test :-)
     */
    public void testAddition2()
    {
        Addition addition = new Addition();
        assertEquals((-2+1), addition.addTwoNumbers(-2,1));
    }


}
