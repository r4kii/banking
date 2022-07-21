import java.util.ArrayList;

public class Customer {

   private int customerID;
   private String name;
   private String password;
   private int accountNum;
   private int balance;
   private ArrayList<Transactions> transactions ;

   public int getCustomerID() {
      return customerID;
   }

   public void setCustomerID(int customerID) {
      this.customerID = customerID;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public long getAccountNum() {
      return accountNum;
   }

   public void setAccountNum(int accountNum) {
      this.accountNum = accountNum;
   }

   public int getBalance() {
      return balance;
   }

   public void setBalance(int balance) {
      this.balance = balance;
   }


   public ArrayList<Transactions> getTransactions() {
      return transactions;
   }

   public void setTransactions(ArrayList<Transactions> transactions) {
      this.transactions = transactions;
   }
}
