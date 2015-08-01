/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

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

        System.out.println("Please input your plaintext here");
        plainText = scan.nextLine();

        //This converts the first letter into ascii, maybe using a while loop will convert the whole text?
        /*
        char character = plainText.charAt(0);
        int ascii = (int) character;

        System.out.println(ascii);
    }

    // This worked - sort of.
    */
        //byte[] b = plainText.getBytes(StandardCharsets.US_ASCII);
        //cannot pass string as byte.
       // System.out.println((byte)plainText);

        System.out.println((char)b);
    }


    private String Decrypt(String encryptedText){
        String decryptedText = "";
        
        return decryptedText;
    }
    
    private String Encrypt (String plainText){
        String cipherText = "";


        return cipherText;
    }
    
}
