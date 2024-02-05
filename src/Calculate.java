public class Calculate {

    public double getMoment(double load, double length) {
        double result;
        result = (load * Math.pow(10, 3) * Math.pow(length, 2)) / 8;
        result /= 1000;
        return result;

    }

    public double getBend(double load, double length, double b, double h) {
        double result;
        double inert = b * Math.pow(h, 3) / 3;
        result = (5 * load * Math.pow(10, 3) * Math.pow(length, 4)) / (384 * 12100 * Math.pow(10, 6) * inert);
        result *= 1000;
        return result;
    }


}
