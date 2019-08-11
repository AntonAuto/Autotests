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
    public void testGetClassNumber ()
    {
        int a = this.getClassNumber();
        Assert.assertTrue("The test has failed. getClassNumber is not more than 45",a > 45);
        System.out.println("The test has finished successfully. getClassNumber is more than 45");
        }
    }
