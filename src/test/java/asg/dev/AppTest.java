package asg.dev;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue(true);
    }
    
    @Test
    public void isStringUtils() {
        assertTrue(org.apache.commons.lang3.StringUtils.capitalize("hello, world").equals("Hello, world"));
    }
}
