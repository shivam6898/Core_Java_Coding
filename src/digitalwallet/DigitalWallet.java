package digitalwallet;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Wallet {
    private String accountHolderName;
    private double balance;
    private List<Transaction> transactions;

    public Wallet(String accountHolder, double balance) {
        this.accountHolderName = accountHolder;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void updateBalance(double amount) {
        balance += amount;
    }
}

class Transaction {
    private String targetAccount;
    private double amount;
    private String type;

    public Transaction(String targetAccount, double amount, String type) {
        this.targetAccount = targetAccount;
        this.amount = amount;
        this.type = type;
    }

    public String getTargetAccount() {
        return targetAccount;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}

public class DigitalWallet {
    private static Map<String, Wallet> allAccountHolderwallets = new HashMap<>();
    private static List<Wallet> transactionList = new ArrayList<>();

    public static void main(String[] args) {
        enterCommand("CreateWallet Sadhana 100");
        enterCommand("CreateWallet Sameer 95.7");
        enterCommand("CreateWallet Pravallika 104");

        enterCommand("Overview");

        enterCommand("TransferMoney Pravallika Sadhana 2");
        enterCommand("TransferMoney Charan Sameer 5");

        enterCommand("Overview");

        enterCommand("Statement Sadhana");
        enterCommand("Statement Charan");


        enterCommand("Overview");
    }

    public static void enterCommand(String command) {
        String[] commands = command.split(" ");
        String action = commands[0];

        switch (action) {
            case "CreateWallet":
                createWallet(commands[1], Double.parseDouble(commands[2]));
                break;
            case "TransferMoney":
                transferMoney(commands[1], commands[2], Double.parseDouble(commands[3]));
                break;
            case "Statement":
                showStatement(commands[1]);
                break;
            case "Overview":
                showOverview();
                break;

            case "offer2":
                 offer2();
                 break;
            default:
                System.out.println("Invalid command: " + command);
        }
    }

    private static void offer2() {
         Stream<Wallet> list =  allAccountHolderwallets.values().stream();
         List<Wallet> wallets =  allAccountHolderwallets.values().stream().sorted(Comparator.comparing(
                Wallet::getTransactions,(list1,list2) -> {
                    int i;
                     i = Integer.compare(list1.size(),list2.size());
                     if (i ==0)
                     {
                        i =  Double.compare(list1.get(0).getAmount(),list1.get(0).getAmount());
                     }
                     if (i== 0)
                     {

                     }
                     return i;
                }
        )).collect(Collectors.toList());

         if (wallets.size() > 3) {
             Wallet wallet1 = wallets.get(0);
             Wallet wallet2 = wallets.get(1);
             Wallet wallet3 = wallets.get(2);

         }


    }

    private static void createWallet(String accountHolder, double initialAmount) {
        if (!allAccountHolderwallets.containsKey(accountHolder)) {
            Wallet wallet = new Wallet(accountHolder, initialAmount);
            allAccountHolderwallets.put(accountHolder, wallet);
            transactionList.add(wallet);
        } else {
            System.out.println("Wallet  already exists " + accountHolder);
        }
    }

    private static void transferMoney(String sender, String receiver, double amount) {
        Wallet senderWallet = allAccountHolderwallets.get(sender);
        Wallet receiverWallet = allAccountHolderwallets.get(receiver);

        if (senderWallet == null || receiverWallet == null) {
            System.out.println("Invalid sender or receiver account.");
            return;
        }

        if (senderWallet.getBalance() >= amount) {
            senderWallet.addTransaction(new Transaction(receiver, amount, "debit"));
            receiverWallet.addTransaction(new Transaction(sender, amount, "credit"));

            senderWallet.updateBalance(-amount);
            receiverWallet.updateBalance(amount);

            if (senderWallet.getBalance() == receiverWallet.getBalance()) {
                senderWallet.addTransaction(new Transaction("Offer1", 10, "credit"));
                receiverWallet.addTransaction(new Transaction("Offer1", 10, "credit"));
                senderWallet.updateBalance(10);
                receiverWallet.updateBalance(10);
            }
        } else {
            System.out.println("Insufficient balance in the sender's account.");
        }
    }

    private static void showStatement(String accountHolder) {
        Wallet wallet = allAccountHolderwallets.get(accountHolder);
        if (wallet != null) {
            System.out.println("Statement for " + accountHolder);
            for (Transaction transaction : wallet.getTransactions()) {
                System.out.println(
                    transaction.getTargetAccount() + " " + transaction.getType() + " " + transaction.getAmount());
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void showOverview() {
        System.out.println("Overview of transactions");
        for (Wallet wallet : transactionList) {
            System.out.println(wallet.getAccountHolderName() + " " + wallet.getBalance());
        }
    }



}
