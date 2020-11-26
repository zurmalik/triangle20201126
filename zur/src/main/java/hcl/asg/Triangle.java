package hcl.asg;

/**
 * Hello Triangle!
 */
public final class Triangle {

    private TriangleValidator validator = new TriangleValidator();

    /**
     * This method prints the numbers.
     */
    public double area(double width, double height) {

        validator.validateInput(width, height);

        double area = (width * height) / 2;

        validator.validateOutput(area);

        System.out.print("area: " + area);
        
        return area;
    }

}
