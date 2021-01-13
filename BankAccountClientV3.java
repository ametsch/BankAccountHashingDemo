package Ch8Classes.bankacct;

import java.util.Scanner;

public class BankAccountClientV3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        BankAccountV2 test = new BankAccountV2("Aaron Metsch", "password", (short) 1234,
                new DOB((byte) 6, (byte) 9, (short) 2016),
                new Address(6969, "Main Street", "Larchmont", "NY", 10538),
                "test@gmail.com", "123456789", "1234567890" );

        System.out.println(test);
    }











}
