package rakshitcoding;

import java.util.Scanner;

interface Salinity {
    public void Salinity_Meter();
}
class Water implements Salinity {
    public void Salinity_Meter(double ppt) {
        if (ppt < 0.05) {
            System.out.println("Fresh Water");
        }
        else if (ppt >- 0.05 && ppt < 0.1) {
            System.out.println("Marginal Water");
        }
        else if (ppt >= 0.1 && ppt < 0.2) {
            System.out.println("Brackish Water");
        }
        else if (ppt >= 0.2 && ppt < 1.0) {
            System.out.println("Saline Water");
        }
        else if (ppt >= 1.0 && ppt < 3.5) {
            System.out.println("Highly Saline Water");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double ppt = in.nextDouble();
        Water w = new Water();
        w.Salinity_Meter(ppt);
    }

    @Override
    public void Salinity_Meter() {
    }
}
