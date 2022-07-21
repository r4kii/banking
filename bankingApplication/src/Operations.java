import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class minBalanceException extends  Exception{

    int balance ;
    minBalanceException(int balance){
        this.balance=balance;
    }
    public String toString(){
        return "insufficient balance\n Your Balance :"+balance;
    }

}
public class Operations{

    Scanner sc = new Scanner(System.in);


    public void withdraw(Customer c){

        System.out.println("Enter amount to withdraw ");
        int withdrawalAmount = sc.nextInt();
        if(withdrawalAmount+1000 <= c.getBalance()){
            c.setBalance(c.getBalance()-withdrawalAmount);


            Transactions t = new Transactions();
            t.setTid(c.getTransactions().size());
            t.setAmount(withdrawalAmount);
            t.setType("AtmWithdrawal");
            t.setBalance(c.getBalance());

            c.getTransactions().add(t);

            System.out.println("Withdrawal Successful");
            System.out.println("Updated balance : "+c.getBalance());
        }
        else{
            try {
                throw new minBalanceException(c.getBalance()) ;
            } catch (minBalanceException e) {
                System.out.println(e);
            }
        }
    }

    public void cashDeposit(Customer c){

        System.out.println("Enter amount to deposited");
        int amount = sc.nextInt();
        c.setBalance(amount+c.getBalance());
        System.out.println("Updated balance : "+c.getBalance());

        Transactions t = new Transactions();
        t.setTid(c.getTransactions().size());
        t.setAmount(amount);
        t.setType("CashDeposit");
        t.setBalance(c.getBalance());

        c.getTransactions().add(t);

    }

    public void accountTransfer(Customer c1,ArrayList<Customer> customerList){

        System.out.println("Enter Beneficiary's Account Number: ");
        int acNum = sc.nextInt();
        Customer c2 = customerList.get(acNum-10000-1);
        System.out.println("Enter amount");
        int amount = sc.nextInt();

        Transactions t1 = new Transactions();
        t1.setTid(c1.getTransactions().size()+1);
        t1.setAmount(amount);
        t1.setType("");
        t1.setBalance(c1.getBalance());

        c1.getTransactions().add(t1);

        Transactions t2 = new Transactions();
        t2.setTid(c1.getTransactions().size());
        t2.setAmount(amount);
        t2.setType("");
        t2.setBalance(c2.getBalance());

        c2.getTransactions().add(t2);

        c1.setBalance(c1.getBalance()-amount);
        c2.setBalance(c2.getBalance()+amount);

    }

    public void viewTransactions(Customer c1){

       for (Transactions t :c1.getTransactions()){
           System.out.print(t.getTid()+" "+t.getAmount()+" "+t.getBalance()+" "+t.getType());
           System.out.println();
       }


    }



//    public static void main(String[] args) {
//
//
//        ArrayList <Customer> al = new ArrayList<>();
//
//
//        Customer c1 = new Customer();
//        c1.setBalance(12000);
//        Operations op = new Operations();
//        op.withdraw(c1);
//        op.cashDeposit(c1);
//    }

}
