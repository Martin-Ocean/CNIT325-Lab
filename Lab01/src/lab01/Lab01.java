package lab01;

import java.util.Scanner;

/**
 *
 * @author Ming
 */
public class Lab01 {

    private double pLength = 0;
    private double wILength = 0;
    private double sEndLength = 0;
    private double dEndLength = 0;

    private double sEndDepth = 0;
    private double dEndDepth = 0;
    private double hTubDepth = 0;

    private double pWidth = 0;
    private double hTubWidth = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lab01 a = new Lab01();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter the Length of the Pool (35 - 60 feet): ");
            a.setpLength(input.nextDouble());
        } while (a.getpLength() < 35.0 || a.getpLength() > 60.0);

        do {
            System.out.println("Please enter the Length of the Walkin (5 feet - 1/3 of the pool length): ");
            a.setwILength(input.nextDouble());
        } while (a.getwILength() < 5.0 || a.getwILength() > (a.getpLength() / 3.0));

        do {
            System.out.println("Please enter the Length of the Shallow end ( 10 feet - 1/3 of the pool length): ");
            a.setsEndLength(input.nextDouble());
        } while (a.getsEndLength() < 10.0 || a.getsEndLength() > (a.getpLength() / 3.0));

        do {
            System.out.println("Please enter the Length of the deep end (12 feet to 1/2 of the pool length): ");
            a.setdEndLength(input.nextDouble());
        } while (a.getdEndLength() < 12.0 || a.getdEndLength() > (a.getpLength() / 2.0));

        do {
            System.out.println("Please enter the Depth of the shallow end (2-5 feet): ");
            a.setsEndDepth(input.nextDouble());
        } while (a.getsEndDepth() < 2.0 || a.getsEndDepth() > 5.0);

        do {
            System.out.println("Please enter the Depth of the deep end (6-12 feet): ");
            a.setdEndDepth(input.nextDouble());
        } while (a.getdEndDepth() < 6.0 || a.getdEndDepth() > 12.0);

        do {
            System.out.println("Please enter the Depth of the hot tub (3-5 feet): ");
            a.sethTubDepth(input.nextDouble());
        } while (a.gethTubDepth() < 3.0 || a.gethTubDepth() > 5.0);

        do {
            System.out.println("Please enter the Width of the hot tub (8-14 feet): ");
            a.sethTubWidth(input.nextDouble());
        } while (a.gethTubWidth() < 8.0 || a.gethTubWidth() > 14.0);

        do {
            System.out.println("Please enter the Width of the pool (15-30 feet): ");
            a.setpWidth(input.nextDouble());
        } while (a.getpWidth() < 15.0 || a.getpWidth() > 30.0);

        System.out.println("\nPool Dimensions (feet)");
        System.out.println("Depth of the shallow end: " + a.getsEndDepth());
        System.out.println("Depth of the deep end: " + a.getdEndDepth());
        System.out.println("Width of the pool: " + a.getpWidth());
        System.out.println("Length of the pool: " + a.getpLength());
        System.out.println("Length of the walk-in: " + a.getwILength());
        System.out.println("Length of the shallow end: " + a.getsEndLength());
        System.out.println("Length of the deep end: " + a.getdEndLength());
        System.out.println("Width of the hot tub: " + a.gethTubWidth());
        System.out.println("Depth of the hot tub: " + a.gethTubDepth());
        System.out.println("Pool Volume" + "\n"
                + "Total volume of pool: "
                + a.poolVolume() + "\n"
                + "Gallons of water to fill: " + a.poolVolume() * 7.481);
        System.out.println("Hot Tub Volume\n"
                + "Total volume of hot tub: " + a.tubVolume() + "\n"
                + "Gallons of water to fill: " + a.tubVolume() * 7.481);
        System.out.println("Total gallons for both: " + a.poolVolume() + a.tubVolume() * 7.481);
        System.out.println("Total cost for both: " + a.poolVolume() + a.tubVolume() * 7.481 * 0.1);
    }

    public double poolVolume() {
        return ((dEndDepth-.5) * dEndLength * pWidth) + (pLength - dEndLength - sEndLength - wILength) * (((dEndDepth + sEndDepth)-1) / 2.0) * pWidth + (sEndLength * (sEndDepth-.5)) * pWidth + pWidth * (wILength * (sEndDepth-.5)) / 2;
    }

    public double tubVolume() {
        return Math.PI * Math.pow(hTubWidth / 2, 2) * (hTubDepth-.5);
    }

    /**
     * @return the pLength
     */
    public double getpLength() {
        return pLength;
    }

    /**
     * @param pLength the pLength to set
     */
    public void setpLength(double pLength) {
        this.pLength = pLength;
    }

    /**
     * @return the wILength
     */
    public double getwILength() {
        return wILength;
    }

    /**
     * @param wILength the wILength to set
     */
    public void setwILength(double wILength) {
        this.wILength = wILength;
    }

    /**
     * @return the sEndLength
     */
    public double getsEndLength() {
        return sEndLength;
    }

    /**
     * @param sEndLength the sEndLength to set
     */
    public void setsEndLength(double sEndLength) {
        this.sEndLength = sEndLength;
    }

    /**
     * @return the dEndLength
     */
    public double getdEndLength() {
        return dEndLength;
    }

    /**
     * @param dEndLength the dEndLength to set
     */
    public void setdEndLength(double dEndLength) {
        this.dEndLength = dEndLength;
    }

    /**
     * @return the sEndDepth
     */
    public double getsEndDepth() {
        return sEndDepth;
    }

    /**
     * @param sEndDepth the sEndDepth to set
     */
    public void setsEndDepth(double sEndDepth) {
        this.sEndDepth = sEndDepth;
    }

    /**
     * @return the dEndDepth
     */
    public double getdEndDepth() {
        return dEndDepth;
    }

    /**
     * @param dEndDepth the dEndDepth to set
     */
    public void setdEndDepth(double dEndDepth) {
        this.dEndDepth = dEndDepth;
    }

    /**
     * @return the hTubDepth
     */
    public double gethTubDepth() {
        return hTubDepth;
    }

    /**
     * @param hTubDepth the hTubDepth to set
     */
    public void sethTubDepth(double hTubDepth) {
        this.hTubDepth = hTubDepth;
    }

    /**
     * @return the pWidth
     */
    public double getpWidth() {
        return pWidth;
    }

    /**
     * @param pWidth the pWidth to set
     */
    public void setpWidth(double pWidth) {
        this.pWidth = pWidth;
    }

    /**
     * @return the hTubWidth
     */
    public double gethTubWidth() {
        return hTubWidth;
    }

    /**
     * @param hTubWidth the hTubWidth to set
     */
    public void sethTubWidth(double hTubWidth) {
        this.hTubWidth = hTubWidth;
    }
}
