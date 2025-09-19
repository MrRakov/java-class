public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if(balance<0){
            balance = 0;
        }
        else{
            this.balance = balance;
        }
    }
    public void deposit(double depositAmount) 
	{
        if(depositAmount>0){
            balance = balance + depositAmount;
        }
	}

    public void setaccountName(String name){
        this.name = name;
    }
    public String getAccountName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }

    public class AccountTest{
        public static void main(String[] args){
            Account account1 = new Account("Egor's account", 2132.1);
            System.out.println("account balance = "+account1.getBalance());
            System.out.println("account name = "+account1.getAccountName());
            account1.deposit(3000);
            account1.setaccountName("Meows");
            System.out.println("account balance = "+account1.getBalance());
            System.out.println("account name = "+account1.getAccountName());
        }
    }
}
