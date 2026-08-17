package com.task13;

import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (str.indexOf(ch) != str.lastIndexOf(ch)
                    && str.indexOf(ch) == i) {

                System.out.println(ch);
            }
        }
    }
}