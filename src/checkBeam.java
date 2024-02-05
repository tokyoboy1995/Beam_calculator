public class checkBeam {

    double Rp = 16.1 * Math.pow(10, 3);
    public double checkBeam(double moment, double b, double h) {
        double k;
        double w = b * Math.pow(h, 2) / 6;
        double Rc = moment / w;
        k = Rc / Rp * 100;

        return Math.round(k);
    }

}

