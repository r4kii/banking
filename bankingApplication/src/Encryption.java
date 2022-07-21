public class Encryption {

    public static String passwordEncryption(String password){

        StringBuilder encryptedPass = new StringBuilder();

        for(int i =0; i<password.length();i++){

            char ch= password.charAt(i);

            if(ch>=97&&ch<=122) encryptedPass.append((char)(96+((int)ch+1-96)%26));
            else if(ch>=65&&ch<=90) encryptedPass.append((char)(64+((int)ch+1-64)%26));
            else encryptedPass.append((char)(47+((int)ch+1-47)%10));

        }

        return encryptedPass.toString();

    }




//    public static void main(String[] args) {
//
//        char ch = 'Z';
//        char ch1 ='a';
//        char ch2='9';
////        System.out.println((char)n);
//        System.out.println((char)(64+((int)ch+1-64)%26));
//        System.out.println((char)(96+((int)ch1+1-96)%26));
//        System.out.println((char)(47+((int)ch2+1-47)%10));
//        System.out.println(ch1>=97);
//
//        System.out.println(passwordEncryption("AB1Zzq"));
//    }
}
