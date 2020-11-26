package hcl.asg;

/**
 * Triangle data validator.
 */
public final class TriangleValidator {

    /**
     * Input should be valid to calculate the area.
     * @param width the base of the tiangle.
     * @param height the rise of the triangle.
     */
    public void validateInput(double width, double height) {
        if (width < 0 || height < 0) {
            throw new RuntimeException("The negative input is not allowed.");
        }
    }

    /**
     * The area should be calculated correctly. If there is an overflow it should be reported correctly.
     * @param area calculated by function
     */
    public void validateOutput(double area) {
        if (Double.isInfinite(area)) {
            throw new RuntimeException("Area could not be calculated or stored correctly");
        }
    }

}
