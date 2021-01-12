package Ch8Classes;


import java.util.Random;

public class BankAccountV2 {
    private static final Random rand = new Random();

    private long balance, initial_value, acct_num;
    private String acct_holder, pwdHash, pinHash, email, phone, socialSecurityNumHash;
    private DOB dob;
    private Address address;


// online constructor
    public BankAccountV2(String acct_holder, String pwd, short pin,
                         DOB dob, Address address,
                         String email, String socialSecurityNum, String phone){
        this.acct_holder = acct_holder;
        this.pwdHash = Hasher.stringHash(pwd);
        this.pinHash = Hasher.stringHash(pin);
        this.socialSecurityNumHash = Hasher.stringHash(socialSecurityNum);
        this.dob = dob;
        this.address = address;
        this.balance = 0;
        this.email = email;
        this.acct_num = rand.nextLong();
        this.phone = phone;
    }
// in person constructor
    public BankAccountV2(String acct_holder, short pin,
                         DOB dob, Address address,
                         long initial_value, String socialSecurityNum, String phone){
        this.acct_holder = acct_holder;
        this.pinHash = Hasher.stringHash(pin);
        this.socialSecurityNumHash = Hasher.stringHash(socialSecurityNum);

        this.dob = dob;
        this.address = address;;
        this.initial_value = initial_value;
        this.balance = initial_value;
        this.acct_num = rand.nextLong();
        this.phone = phone;
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public boolean changePin(short oldPin, short newPin){
        String newHash = "";
        if(comparePin(oldPin)){
            newHash = Hasher.stringHash(newPin);
            this.pinHash = newHash;
            return true;
        }else{
            return false;
        }
    }
    public boolean comparePwd(String pwd){
        String hash = Hasher.stringHash(pwd);
        return true;
    }
    public boolean comparePin(short pin){
        String hash = Hasher.stringHash(pin);
        return this.pinHash.equals(hash);
    }
    public boolean compareSSN(String ssn){
        String hash = Hasher.stringHash(ssn);

        return this.socialSecurityNumHash.equals(hash);
    }
    public double getBal(){
        return this.balance;
    }
    public boolean deposit(long amount){
        this.balance += amount;
        return true;
    }
    public boolean withdraw(long amount){
        if(this.balance - amount < 0){
            return false;
        }else {
            this.balance -= amount;
            return true;
        }
    }

    public long getBalance() {
        return balance;
    }

    public String getPhone() {
        return phone;
    }

    public String getAcct_holder() {
        return acct_holder;
    }

    public String getEmail() {
        return email;
    }

    public DOB getDob() {
        return dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "BankAccountV2{" +
                "balance=" + balance +
                ", acct_num=" + acct_num +
                ", phone=" + phone +
                ", acct_holder='" + acct_holder + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                '}';
    }
}
