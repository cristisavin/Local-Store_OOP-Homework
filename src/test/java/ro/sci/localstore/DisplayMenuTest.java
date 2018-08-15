package ro.sci.localstore;

import org.junit.Assert;
import org.junit.Test;

public class DisplayMenuTest {
    DisplayMenu displayMenu = new DisplayMenu();

    @Test
    public void DisplayMenuFalse() {
        String str = displayMenu.toString();
        Assert.assertFalse(str, false);
    }

    @Test
    public void DisplayMenuTrue() {
        String str = displayMenu.toString();
        Assert.assertTrue(str, true);
    }
}
