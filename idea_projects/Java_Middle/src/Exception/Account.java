package Exception;

public class Account {
    protected double balance;
    public Account(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return this.balance;
    }
    public void Deposit(double amt){
        this.balance+=amt;
    }
    public void withDraw(double amt) throws OverDraftException{
        if (this.balance<amt){
            throw new OverDraftException("No more amount",amt-this.balance);
        }
        this.balance-=amt;
    }

    public static void main(String[] args) {
        Account a= new Account(100);
        a.Deposit(2000);
        try {
            a.withDraw(10000);
        } catch (OverDraftException e){
            System.out.println(e.getMessage());
            System.out.println(e.getDeficit());
            System.err.println(e.getDeficit());
            e.printStackTrace();
        }

    }

}
