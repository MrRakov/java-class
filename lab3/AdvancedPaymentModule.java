public class AdvancedPaymentModule extends PaymentModule {
    public AdvancedPaymentModule(double q){
        super(q);
    }

    public double payment(Employee[] employee){
        totalPay = 0;
        for(Employee e: employee){
            double pay = 0;
            if(e instanceof Manager){
            Manager m = (Manager) e;
                if(m.getWorkYear() > 10){
                    pay = m.computePay()*2;
                
                }
            }
            else{
            pay = e.computePay();  
        }
        totalPay = totalPay+pay;
        }

        return totalPay;
    }
}
