package inheritance;

import java.text.DecimalFormat;
import java.util.Scanner;

class VISACard {
    private String holderName;
    private String ccv;
    public Double computeRewardPoints(String purchaseType, Double amount) {
        double dis = 0.01*amount;
        return dis;
    }
    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }
}
class HPVISACard extends VISACard {
    public Double computeRewardPoints(String purchaseType, Double amount) {
        double dis = super.computeRewardPoints(purchaseType, amount);
        if (purchaseType.compareTo("fuel") == 0) {
            return dis+10;
        }
        else {
            return dis;
        }
    }
}
public class VISARewardCalculation {
    public static void main(String... args) {
        VISACard v = new VISACard();
        HPVISACard h = new HPVISACard();
        DecimalFormat d = new DecimalFormat("0.0");
        Scanner in = new Scanner(System.in);
        v.setHolderName(in.nextLine());
        v.setCcv(in.nextLine());
        Double amount = Double.parseDouble(in.nextLine());
        String type = in.nextLine();
        int n = Integer.parseInt(in.nextLine());
        if (n == 1) {
            double res = v.computeRewardPoints(type, amount);
            System.out.println(d.format(res));
        }
        else if (n == 2) {
            double res = h.computeRewardPoints(type, amount);
            System.out.println(d.format(res));
        }
        else {
            System.out.println("Invalid Choice");
        }
    }

}
