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

       //Got it.
        int counter = 0;
        for(int i=0; i <plainText.length(); i++) {
            char character = plainText.charAt(i);
            int ascii = (int) character;

            System.out.print(ascii +" ");
            counter++;
        }
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
