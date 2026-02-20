/**
 * OOPSBannerApp - UC4
 * Displays "OOPS" banner using Array and Loop.
 *
 * @author YourName
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store all banner lines inside an array
        String[] banner = {

                String.join("  ", " ***** ", " ***** ", "****** ", " ***** "),
                String.join("  ", "*     *", "*     *", "*     *", "*     *"),
                String.join("  ", "*     *", "*     *", "*     *", "*      "),
                String.join("  ", "*     *", "*     *", "****** ", " ***** "),
                String.join("  ", "*     *", "*     *", "*      ", "      *"),
                String.join("  ", "*     *", "*     *", "*      ", "*     *"),
                String.join("  ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        // Loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
