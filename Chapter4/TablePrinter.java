package Chapter4;

public class TablePrinter {

        public static void main(String[] args) {
            // Print the table header
            System.out.println("Item Value");

            // Use a loop to print the table rows
            for (int i = 1; i <= 4; i++) {
                double value = 0;
                if (i == 1) {
                    value = 239.99;
                } else if (i == 2) {
                    value = 129.75;
                } else if (i == 3) {
                    value = 99.95;
                } else if (i == 4) {
                    value = 350.89;
                }
                System.out.println(i + " " + value);
            }

            // Print the second table
            System.out.println("N N^2 N^3 N^4");
            for (int i = 1; i <= 5; i++) {
                int nSquared = i * i;
                int nCubed = i * i * i;
                int nQuad = i * i * i * i;
                System.out.println(i + " " + nSquared + " " + nCubed + " " + nQuad);
            }
        }
    }


