/*
*THINGS THAT STILL NEED TO BE DONE:
* - Saving the string of ascii into an array so it can be manipulated by the final value of ascii.
* - Shift array by digits of the final value of ascii.
* - Reverse process for decryption.
* - Migrate encryption to encryption method.
* - Migrate decryption to decryption method.
* - Add interface to choose whether to encrypt or decrypt plaintext/cyphertext.
 */

package cipher;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author Patrick
 */
public class Cipher {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {

        String plainText = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input your plaintext here");//Welcome text reading in plaintext.
        plainText = scan.nextLine();

        //Logic
        int counter = 0; //Counter is included for decryption as everything done here needs to be reversed.
        int sum = 0; // Sum represents the total of ascii values through addition.
        for (int i = 0; i < plainText.length(); i++) { //Basic for-loop that iterates through the length of the plaintext.
            char character = plainText.charAt(i); //i representing the ith letter of the plaintext.
            int ascii = (int) character; //parsing char to int.
            System.out.print(ascii + " "); //Prints spaced ascii characters.
            counter++; //Again this is just for decryption representing every character of the plaintext.
            sum += ascii; //Adds ascii value to the total sum.
        }
        System.out.println(""); //Simply separates the displayed array of ascii values to the total.
        System.out.println("Total: " + sum); //Prints the sum of all ascii values.



/*

    private String Decrypt(String encryptedText){
        String decryptedText = "";
        
        return decryptedText;
    }
    
    private String Encrypt (String plainText){
        String cipherText = "";


        return cipherText;
    }
    */
    } //Main
}
