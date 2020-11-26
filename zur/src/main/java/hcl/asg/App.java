package hcl.asg;

/**
 * Hello world!
 */
public final class App {

    private static final int MAX = 10;

    /**
     * This method prints the numbers.
     */
    public void print() {

        for (int i = 1; i <= MAX; i++) {
            System.out.print(i);
            if (i != MAX) {
                System.out.print(',');
            }
        }
    }

}
