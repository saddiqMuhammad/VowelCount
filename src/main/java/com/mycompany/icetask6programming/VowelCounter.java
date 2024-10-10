/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask6programming;

import java.util.Scanner;

/**
 *
 * @author TECH DEALZ
 */

public class VowelCounter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        int vowelCount = countVowels(sentence);
        
        System.out.println("Number of vowels in the sentence: " + vowelCount);
    }
    
    public static int countVowels(String sentence) {
        int count = 0;
        String vowels = "aeiou";
        sentence = sentence.toLowerCase();
        
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        
        return count;
    }
}
 
