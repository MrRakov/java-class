public class AdvancedPaymentModuleText {
    public static void main(String[] args) {
        AdvancedPaymentModule AA = new AdvancedPaymentModule(0);
        Employee[] em = new Employee[3];
        em[0] = new Manager("qweq", 23222, 9);
        em[1] = new Manager("qq", 23262, 11);
        em[2] = new Employee();
        System.out.println(AA.payment(em));
    }
}
