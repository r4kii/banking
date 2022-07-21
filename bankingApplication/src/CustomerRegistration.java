import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerRegistration {

    static Scanner sc = new Scanner(System.in);

    public void createCustomer(ArrayList<Customer> customerList){
       // CustomerRegistration cr = new CustomerRegistration();
        Customer c = new Customer();

        System.out.println("Enter Name: ");
        c.setName(sc.nextLine());
        System.out.println("Enter password: ");
        String tempPass = sc.nextLine();
        System.out.println("Confirm password: ");
        String passCheck = sc.nextLine();
        while(!tempPass.equals(passCheck)){
            System.out.println("Password do not match, Please re-enter your password");
            tempPass=sc.nextLine();
            System.out.println("Confirm password: ");
            passCheck = sc.nextLine();
        }
        System.out.println("Password confirmed");
        c.setPassword(Encryption.passwordEncryption(passCheck));
        c.setBalance(10000);
        c.setCustomerID(customerList.size()+1);
        c.setAccountNum(10000+customerList.size()+1);

        ArrayList<Transactions> transactionsList = new ArrayList<>();
        c.setTransactions(transactionsList);


        Transactions t = new Transactions();
        t.setTid(1);t.setType("Opening");
        t.setAmount(10000);
        t.setBalance(c.getBalance());

        c.getTransactions().add(t);

        System.out.println("Account has been created");

        System.out.println("Customer ID:"+ c.getCustomerID());
        System.out.println("Account Number:"+ c.getAccountNum());
        customerList.add(c);
//        c.setCustomerID(cr.generateID());
//        c.setAccountNum(cr.generateAccountNum());

//        try {
//
//            setDetailsToFile(c);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }


//    public void setDetailsToFile(Customer c)throws IOException {
//
//        FileWriter fw = new FileWriter("/Users/rakesh/Documents/BankingApplication/filebank_db.txt" );
//        fw.write(c.getCustomerID()+" "+c.getName()+" "+c.getPassword()+" "+c.getAccountNum()+" "+c.getBalance()+"\n");
//
//    }

//    public int generateID() throws IOException {
//
//        return countLine()+1;
//
//    }

//    public int generateAccountNum() throws IOException{
//
//        int n = countLine()+1;
//        return 10000+n;
//
//    }
//
//    public int countLine()throws IOException{
//
//        FileReader fr = new FileReader("/Users/rakesh/Documents/BankingApplication/filebank_db.txt" );
//
//        BufferedReader reader = new BufferedReader(fr);
//        int lines = 0;
//        while (reader.readLine() != null) lines++;
//        reader.close();
//
//        return lines;
//    }


}
