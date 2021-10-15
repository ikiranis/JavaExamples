/**
 * Created by Yiannis Kiranis <yiannis.kiranis@gmail.com>
 * https://apps4net.eu
 * Date: 12/10/21
 * Time: 12:16 π.μ.
 *
 * Άσκηση 2.30 του Deitel, Java Προγραμματισμός
 *
 * Σπάσιμο 5ψήφιου αριθμού στα ψηφία του
 * 
 */

import java.util.Scanner;

public class Task_2_30 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int digit1, digit2, digit3, digit4, digit5;

        System.out.print("Give 5 digits number: ");
        number = input.nextInt();

        digit1 = number / 10000;
        number = (number % 10000);

        digit2 = number / 1000;
        number = (number % 1000);

        digit3 = number / 100;
        number = (number % 100);

        digit4 = number / 10;
        number = (number % 10);

        digit5 = number;

        System.out.printf("The number is %d %d %d %d %d", digit1, digit2, digit3, digit4, digit5);
    }
}

