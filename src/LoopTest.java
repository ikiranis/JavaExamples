/**
 * Created by Yiannis Kiranis <yiannis.kiranis@gmail.com>
 * https://apps4net.eu
 * Date: 13/10/21
 * Time: 6:20 μ.μ.
 *
 * Test i = i++
 * https://stackoverflow.com/questions/7911776/what-is-x-after-x-x
 *
 */

public class LoopTest {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i = i++) {
            i += 1;
            System.out.println("Hello World!");
        }
    }
}
