package com.anonymous;


@FunctionalInterface
interface CharChecker {
    void checkChar(char ch);
}
public class CharCheckPrime {

    public static void main(String[] args) {

        CharChecker checker = new CharChecker() {

            public void checkChar(char ch) {

                int ascii = (int) ch;
                boolean prime = true;

                if (ascii <= 1) {
                    prime = false;
                }

                for (int i = 2; i <= ascii / 2; i++) {
                    if (ascii % i == 0) {
                        prime = false;
                        break;
                    }
                }

                System.out.println("Character : " + ch);
                System.out.println("ASCII Value : " + ascii);
                System.out.println(prime
                        ? "ASCII value is Prime"
                        : "ASCII value is Not Prime");
            }
        };

        checker.checkChar('G');
    }
}