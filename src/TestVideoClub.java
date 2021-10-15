/**
 * Created by Yiannis Kiranis <yiannis.kiranis@gmail.com>
 * https://apps4net.eu
 * Date: 15/10/21
 * Time: 5:43 μ.μ.
 *
 * Testing the VideoClubObj class
 *
 */

public class TestVideoClub {

    public static void main(String[] args) {
        VideoClubObj movie1 = new VideoClubObj(1, "Matrix 1" , "Πίνακας 1", (short) 90, "Scifi", 3);
        VideoClubObj movie2 = new VideoClubObj(2, "Lord of the Rings" , "Ο άρχοντας των δαχτυλιδιών", (short) 120, "Fantasy", 5);

        movie1.shortPrint();
        System.out.printf("Κόστος: %.2f%n", movie1.cost(5));

        movie2.shortPrint();
        System.out.printf("Κόστος: %.2f%n", movie2.cost(5));
    }

}
