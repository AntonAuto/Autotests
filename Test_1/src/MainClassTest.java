import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Before
    public void textStartTest()
    {
        System.out.println("A test is starting");
    }
    @Test
    public void testGetLocalNumber ()
    {
        int a = this.getLocalNumber(14);
        Assert.assertTrue("The test has failed. getLocalNumber is not 14",a == 14);
        System.out.println("The test has finished successfully. getLocalNumber is 14");
    }
}
