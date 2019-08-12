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
    public void testGetClassString()
    {
        String a = this.getClassString();
        {
        if (a.contains("Hello")) {
            System.out.println("The test has successfully finished. A string contains Hello");
        } else if (a.contains("hello")) {
            System.out.println("The test has successfully finished. A string contains hello");
        } else
            {
                Assert.fail("The test has failed. A string does not contain Hello or hello");
            }
        }
    }
}
