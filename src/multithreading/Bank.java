package multithreading;

public class Bank {
    float balance = 5000.0f;
    public synchronized void withdrawal(float withdrawalAmount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        if (balance < withdrawalAmount ){
            System.out.println("Less Balance waiting to deposit");
            wait();
        }
        balance  = balance-withdrawalAmount;
        System.out.println("Withdrawal Completed...");
    }

    public synchronized void deposit(float depositAmount) {
        System.out.println(Thread.currentThread().getName());
        balance  = balance+ depositAmount;
        System.out.println("Balance deposit complete...");
        notify();
    }
}

class Customer1 extends Thread{
    Bank b;
    Customer1(Bank b ){
        this.b = b;
    }
    public void run(){
        try {
            b.withdrawal(8000.0f);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Customer2 extends Thread{
    Bank b;
    Customer2(Bank b ){
        this.b = b;
    }
    public void run(){
        b.deposit(8000.0f);
    }
}

class Demo{
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer1 customer1 = new Customer1(bank);
        customer1.setName("Customer-1-thread");
        customer1.start();
        Customer2 customer2 = new Customer2(bank);
        customer2.setName("Customer-2-thread");
        customer2.start();
    }
}
