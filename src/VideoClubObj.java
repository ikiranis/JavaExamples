/**
 * Created by Yiannis Kiranis <yiannis.kiranis@gmail.com>
 * https://apps4net.eu
 * Date: 15/10/21
 * Time: 4:58 μ.μ.
 *
 * Άσκηση για την 1η ΟΣΣ
 *
 */

public class VideoClubObj {

    private int code;
    private String titleEN;
    private String titleGR;
    private short duration;
    private String category;
    private float rentCostPerDay;
    private static float baseCost = 2;

    VideoClubObj() {
        this.code = 0;
        this.titleEN = "Τίτλος στα αγγλικά";
        this.titleGR = "Τίτλος στα ελληνικά";
        this.duration = 90;
        this.category = "Κατηγορία";
        this.rentCostPerDay = 3;
    }

    VideoClubObj(int code, String titleEN, String titleGR, short duration, String category, float rentCostPerDay) {
        this.code = code;
        this.titleEN = titleEN;
        this.titleGR = titleGR;
        this.duration = duration;
        this.category = category;
        this.rentCostPerDay = rentCostPerDay;
    }

    public void shortPrint() {
        System.out.printf("Κωδικός: %d%n", this.code);
        System.out.printf("Τίτλος στα αγγλικά: %s%n", this.titleEN);
        System.out.printf("Διάρκεια: %d%n", this.duration);
    }

    public float cost(int days) {
        return baseCost + (days * this.rentCostPerDay);
    }

    public String toString() {
        return "Code: " + this.code + ", English title: " + this.titleEN + ", Greek title: " + this.titleGR
                + ", Duration: " + this.duration + ", Category: " + this.category;
    }

    public static void setBaseCharge(float b) {
        baseCost = b;
    }
}
