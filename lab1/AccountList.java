public class AccountList {
    
    private Account[] accounts;

    public AccountList(int numOfAccounts) {
        accounts = new Account[numOfAccounts];
    }

    public boolean appendAccount(Account account){
        int i;
        for(i = 0; i < accounts.length; i++){
            if(accounts[i] == null){
                accounts[i] = account;
                return true;
            }
        }
        return false;
    }
    public Account getAccount(int idx){
        if(accounts.length > idx){
            return accounts[idx];
        }
        else{
            System.out.println("Input index exceeds the number of appended elements");
            return null;
        }
    }


    public class AccountListTest {
	public static void main(String[] args) {
		AccountList al = new AccountList(3);
		// success should be true
		boolean success = al.appendAccount(new Account("“Oak”", 1.0));
		success = al.appendAccount(new Account("“Two”", 0.1));
		// It should print “Input index exceeds the number of appended elements”
		Account account = al.getAccount(3);
		System.out.println(account); // should print null
		account = al.getAccount(1);
		// Or whatever getter is specified. It should print 0.1.
		System.out.println(account.getBalance()); 
		success = al.appendAccount(new Account("“tmp”", 0));
		success = al.appendAccount(new Account("“tmp2”", 0));
		System.out.println(success); // it should print false 
	}
}

}
