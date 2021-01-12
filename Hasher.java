package Ch8Classes;
import org.jetbrains.annotations.NotNull;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Java program to calculate SHA hash value

class Hasher {
    private static final String hashAlgo = "SHA-256";

    public static byte[] getSHA(@NotNull String input) throws NoSuchAlgorithmException {
        // Static getInstance method is called with hashing SHA
        MessageDigest md = MessageDigest.getInstance(hashAlgo);

        // digest() method called
        // to calculate message digest of an input
        // and return array of bytes
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }

    public static String toHexString(byte[] hash) {
        // Convert byte array into signum representation
        BigInteger number = new BigInteger(1, hash);

        // Convert message digest into hex value
        StringBuilder hexString = new StringBuilder(number.toString(16));

        // Pad with leading zeros
        while (hexString.length() < 32)
        {
            hexString.insert(0, '0');
        }

        return hexString.toString();
    }

    public static String stringHash(String input){
        String newHash = "";
        try {
            newHash = Hasher.toHexString(Hasher.getSHA(String.valueOf(input)));
        }catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }
        return newHash;
    }

    public static String stringHash(int input){
        String newHash = "";
        try {
            newHash = Hasher.toHexString(Hasher.getSHA(String.valueOf(input)));
        }catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }
        return newHash;
    }

    public static String stringHash(long input){
        String newHash = "";
        try {
            newHash = Hasher.toHexString(Hasher.getSHA(String.valueOf(input)));
        }catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }
        return newHash;
    }

    public static String stringHash(short input){
        String newHash = "";
        try {
            newHash = Hasher.toHexString(Hasher.getSHA(String.valueOf(input)));
        }catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }
        return newHash;
    }

    public static String stringHash(byte input){
        String newHash = "";
        try {
            newHash = Hasher.toHexString(Hasher.getSHA(String.valueOf(input)));
        }catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }
        return newHash;
    }

    public static String stringHash(double input){
        String newHash = "";
        try {
            newHash = Hasher.toHexString(Hasher.getSHA(String.valueOf(input)));
        }catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }
        return newHash;
    }




}
