package hcl.asg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple validator.
 */
class TriangleValidatorTest {

    private static TriangleValidator triangleValidator;

    @BeforeAll
    public static void setUpStreams() {
        triangleValidator = new TriangleValidator();
    }

    @Test
    void testValidateInputForValidInput() {
        triangleValidator.validateInput(1, 0);
    }

    @Test
    void testValidateInputForInvalidInput() {
        Assertions.assertThrows(Exception.class, () -> triangleValidator.validateInput(-1, 0));
    }

    @Test
    void testValidateOutputForValidOutput() {
        triangleValidator.validateOutput(2);
    }

    @Test
    void testValidateOutputForInvalidOutput() {
        double area = Double.MAX_VALUE * Double.MAX_VALUE;
        Assertions.assertThrows(Exception.class, () -> triangleValidator.validateOutput(area));
    }

}
