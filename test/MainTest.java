import java.util.Scanner;
import junit.framework.TestCase;

public class MainTest extends TestCase  {


    public void testHelloAndras() {

        Main main = new Main();


        assertEquals("Hello Andras!", main.hello("Andras"));

    }


    public void testHelloEmptyString() {

        Main m = new Main();

        assertEquals("Hello World!", m.hello(""));
    }
}