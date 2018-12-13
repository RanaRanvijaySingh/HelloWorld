package example.com.helloworld;

import org.junit.Assert;
import org.junit.Test;

public class ValidTest {

    @Test
    public void emailTestForValidInput(){
        Assert.assertEquals(false, Valid.email("a@a.com"));
    }

    @Test
    public void emailTestForBlank(){
        Assert.assertEquals(false, Valid.email(""));
    }

    @Test
    public void emailTestForSpace(){
        Assert.assertEquals(false, Valid.email(" "));
    }

    @Test
    public void emailTestForInvalidInput(){
        Assert.assertEquals(false, Valid.email("a.com "));
    }
}
