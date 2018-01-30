package Introducing;

import org.testng.annotations.*;

public class TestNGIgnoreTest {

    @Test(enabled = false)
    public void testSetProperty() {
        System.out.println("Этот метод будет проигнорирован в момент проведения тестирования!");
    }
}
