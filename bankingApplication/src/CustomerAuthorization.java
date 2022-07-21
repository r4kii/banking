import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerAuthorization {



    public  boolean authentication(int customerID, String password, ArrayList<Customer> customersList){

        return Encryption.passwordEncryption(password).equals((customersList.get(customerID-1).getPassword()));

    }

//    public boolean authentication(int customerID, String password) throws IOException {
//
//        FileReader fr = new FileReader("/Users/rakesh/Documents/BankingApplication/filebank_db.txt" );
//
//        Scanner scanner = new Scanner(fr);
//        CustomerRegistration cr = new CustomerRegistration();
//        int lines = cr.countLine();
//        while (lines!=0) {
//            int id = Integer.parseInt(scanner.next());
//            if(customerID==id){
//                String pass = scanner.next();
//                if(pass.equals(Encryption.passwordEncryption(password))){
//                    return true;
//                }
//            }
//            else {
//                scanner.nextLine();
//            }
//            lines--;
//        }
//        return false;
//    }

//    public static void main(String[] args) throws IOException {
//
//        CustomerAuthorization ca = new CustomerAuthorization();
//       // System.out.println(ca.authentication(1,"bcA1"));
//        CustomerRegistration cr = new CustomerRegistration();
//        int lines = cr.countLine();
//        System.out.println(lines);
//        System.out.println(ca.authentication(2,"ggf"));
//    }
}
