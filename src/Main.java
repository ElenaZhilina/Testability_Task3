public class Main {
    public static void main(String[] args) {
                CreditPaymentService service = new CreditPaymentService ();
        int payment = (int) service.calculate(9.99, 1000000, 12);
        System.out.println(payment);

        payment = (int) service.calculate(9.99, 1000000, 24);
        System.out.println(payment);

        payment = (int) service.calculate(9.99, 1000000, 36);
        System.out.println(payment);
    }
}