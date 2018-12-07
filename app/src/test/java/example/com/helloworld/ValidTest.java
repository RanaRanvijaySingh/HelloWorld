package example.com.helloworld;

import org.junit.Assert;
import org.junit.Test;

public class ValidTest {

    @Test
    public void emailTestForValidInput(){
        Assert.assertEquals(true, Valid.email("a@a.com"));
    }
}
