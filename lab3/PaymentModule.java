public class PaymentModule {
    protected double totalPay;
    public PaymentModule(double totalPay){
        this.totalPay = totalPay;
    }

    public double payment(Employee employee){
        if(employee instanceof Manager){
            Manager m = (Manager) employee;
            if(m.getWorkYear() > 10){
                totalPay = m.computePay()*2.0f;
                
            }
            return totalPay;
        }
        else{
            totalPay = employee.computePay();
            return totalPay;
        }
    }
}
