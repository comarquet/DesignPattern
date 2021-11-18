package com.company;

public class RomanDisplay {
    private static String[][] table = {
            {"CM", "D", "CD", "C"},
            {"XC", "L", "XL", "X"},
            {"IX", "V", "IV", "I"}
    };

    private String convertIntToRoman(int value) {
        String resultString = "";
        if (value > 3999) {
            /** We don't know how to represent numbers greater than 3999 */
            return "****";
        }

        while (value >= 1000) {
            resultString += "M";
            value -= 1000;
        }
        for (int multiplier = 100, index = 0; multiplier >= 1;
             multiplier /= 10, index++) {
            if (value >= 9 * multiplier) {
                resultString += table[index][0];
                value -= 9 * multiplier;
            } else if (value >= 5 * multiplier) {
                resultString += table[index][1];
                value -= 5 * multiplier;
            } else if (value >= 4 * multiplier) {
                resultString += table[index][2];
                value -= 4 * multiplier;
            }
            while (value >= 1 * multiplier) {
                resultString += table[index][3];
                value -= 1 * multiplier;
            }
        }

        return resultString;
    }

    public void update(int val) {
        System.out.println("Roman display : " + this.convertIntToRoman(val));
    }
}
