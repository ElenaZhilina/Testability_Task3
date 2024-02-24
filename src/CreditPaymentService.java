public class CreditPaymentService {
    public double calculate(double percent, double sumRub, double termMonth) {
        double v = 1 + percent / 12;
        return (sumRub * (((percent / 12) * Math.pow(v, termMonth)) / (Math.pow(v, termMonth) - 1)));
    }
}

