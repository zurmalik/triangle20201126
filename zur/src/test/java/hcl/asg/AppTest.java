package hcl.asg;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class AppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    /**
     * Basic test that the framework loaded. In sprint it could be something like spring context has been initialized.
     */
    @Test
    void testApp() {
        Assertions.assertTrue(true);
    }

    /**
     * Test print method.
     */
    @Test
    void testPrint() {
        new App().print();
        Assertions.assertEquals("1,2,3,4,5,6,7,8,9,10", outContent.toString());
    }

}
