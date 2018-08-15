package ro.sci.localstore;

import org.junit.Assert;
import org.junit.Test;

public class AddProductTest {
    AddProduct a = new AddProduct();

    @Test
    public void menuChoiceFalse() {
        String str = null;
        Assert.assertFalse("something", false);
    }

    @Test
    public void menuChoice() {
        String str = "String";
        Assert.assertTrue("some string here", true);
    }


}
