import java.util.Scanner;

/**
 * Created by jack finlay and patrick pickworth on 29/07/15.
 */
public class Cipher {

    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Plaintext: ");
        String plainText = scanner.nextLine();

        System.out.print("Enter the key: ");
        String key = scanner.nextLine();

        System.out.println("The ciphertext is: " + encrypt(plainText, key));
        System.out.print("Enter the Ciphertext: ");
        String cipherText = scanner.nextLine();

        System.out.print("Enter the key: ");
        key = scanner.nextLine();

        System.out.println("The plaintext is: " + decrypt(cipherText,key));


    }


    private static String encrypt (String plainText, String key){
        StringBuilder cipherText = new StringBuilder();

        for ( int i = 0; i<plainText.length();i++) {
            int keyI = i % key.length() ;

            int xor = (int)(plainText.charAt(i) ^ (int)key.charAt(keyI));

            cipherText.append((char)(xor+32));

        }

        return cipherText.toString();
    }


    private static String decrypt (String cipherText, String key) {
        StringBuilder plainText = new StringBuilder();

        for ( int i = 0; i<cipherText.length();i++  ) {
            int keyI = i % key.length() ;

            int xor = (int)(((int)cipherText.charAt(i)-32) ^ (int)key.charAt(keyI));

            plainText.append((char)(xor));
        }


        return plainText.toString();
    }
}
