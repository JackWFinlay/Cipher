import java.util.Scanner;

/**
 * Created by jack on 29/07/15.
 */
public class Cipher {

    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Plaintext: ");
        String plainText = scanner.nextLine();

        System.out.println("The ciphertext is: " + encrypt(plainText));

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.print("Enter the Ciphertext: ");
        String cipherText = scanner.nextLine();

        System.out.println("The plaintext is: " + decrypt(cipherText));


    }


    private static String encrypt (String plainText){
        StringBuilder cipherText = new StringBuilder();

        for ( char c : plainText.toCharArray() ) {
            int val = c;

            char shiftedC = (char)(c + val);
            cipherText.append(shiftedC);

        }

        return cipherText.toString();
    }


    private static String decrypt (String cipherText) {
        StringBuilder plainText = new StringBuilder();

        for ( char c: cipherText.toCharArray() ) {
            int val = c/2;

            char decryptedC = (char)val;

            plainText.append(decryptedC);
        }


        return plainText.toString();
    }
}
