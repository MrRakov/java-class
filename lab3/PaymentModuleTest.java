public class PaymentModuleTest {
    public static void main(String[] args) {
        PaymentModule p = new PaymentModule(0.00f);
        Employee employee = new Employee();
        Manager manager = new Manager("Maga", 12.2, 11);
        System.out.println(p.payment(employee));
        System.out.println(p.payment(manager));
        
    }
}
