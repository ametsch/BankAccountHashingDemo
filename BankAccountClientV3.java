package Ch8Classes;

import java.util.Scanner;

public class BankAccountClientV3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        BankAccountV2 test = new BankAccountV2("Aaron Metsch", "password", (short) 1234,
                new DOB((byte) 16, (byte) 12, (short) 2003),
                new Address(40, "Byron Lane", "Larchmont", "NY", 10538),
                "test@gmail.com", "123456789", "9148337958" );

        System.out.println(test);
    }











}
