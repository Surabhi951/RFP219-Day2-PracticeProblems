package com.bridgelabz.switch_statement;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Alphabet: ");
        char ch = sc.next().charAt(0);
        VowelConsonant vowelConsonant = new VowelConsonant();
        vowelConsonant.checkVowelOrConsonant(ch);
    }

    public void checkVowelOrConsonant(char ch){
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is vowel");
                break;
            default :
                System.out.println(ch + " is consonant");
        }
    }
}
