package ordenastrings;

import java.util.Arrays;

/**
 * @author Elba Leon
 */
public class Ordenastrings {

    public static void main(String[] args) {

        String[] nombres = {"Alvaro", "Rosa", "Agustin", "Carmen", "Zoila"};
        Arrays.sort(nombres);
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }

    }
}
