package com.test;

public class LocalDemo {
    public static void main(String[] args) {

        String str = "racecar";
        char c = 'a';
        removeVowels(str, c);


    }

    private static void removeVowels(String str, char c) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != c)
                result = result + str.charAt(i);
        }
        System.out.println(result);
    }
}