package hcl.asg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple triangle.
 */
class TriangleTest {

    private static final int HEIGHT = 4;
    private static final int WIDTH = 2;
    private static final int ZERO = 0; // Area or length
    private static final int NEGATIVE_LENGTH = -2;
    private static final int EXXPECTED_AREA = 4;

    private static Triangle triangle;

    @BeforeAll
    public static void setUpStreams() {
        triangle = new Triangle();
    }

    @Test
    void testAreaForSimpleCase() {
        double area = triangle.area(WIDTH, HEIGHT);
        Assertions.assertEquals(EXXPECTED_AREA, area);
    }

    @Test
    void testAreaForZeroArea() {
        double area = triangle.area(ZERO, HEIGHT);
        Assertions.assertEquals(ZERO, area);
    }

    @Test
    void testAreaForMaximumValues() {
        Assertions.assertThrows(Exception.class, () -> triangle.area(Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    void testAreaForNegativeValueCase() {
        Assertions.assertThrows(Exception.class, () -> triangle.area(NEGATIVE_LENGTH, HEIGHT));
        Assertions.assertThrows(Exception.class, () -> triangle.area(WIDTH, NEGATIVE_LENGTH));
    }

}
