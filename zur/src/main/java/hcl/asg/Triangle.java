package hcl.asg;

/**
 * Hello world!
 */
public final class Triangle {

    private static final int MAX = 10;

    /**
     * Says hello to the triangle.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello Triangle!");
    }

    /**
     * This method prints the numbers.
     */
    public double area(double width, double height) {
        if (width < 0 || height < 0) {
            throw new RuntimeException("The negative input is not allowed.");
        }

        double area = (width * height) / 2;

        if (Double.isInfinite(area)) {
            throw new RuntimeException("Area could not be calculated or stored correctly");
        }

        System.out.print("area: " + area);
        return area;
    }

}
