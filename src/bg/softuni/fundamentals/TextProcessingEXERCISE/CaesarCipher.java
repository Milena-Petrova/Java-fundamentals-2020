package bg.softuni.fundamentals.TextProcessingEXERCISE;

import java.util.Scanner;
/*
Write a program that returns an encrypted version of the same text.
 Encrypt the text by shifting each character with three positions forward.
 For example A would be replaced by D, B would become E, and so on. Print the encrypted text.
Programming is cool! ---->	Surjudpplqj#lv#frro$
One year has 365 days. ---> Rqh#|hdu#kdv#698#gd|v1
 */
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
       // line.toCharArray();
        for (char c : line.toCharArray()) {
        //    char current = (char)c;
            System.out.print((char)(c+3));
        }


    }
}
