package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public int addDigits(String s) {

        if (s == null || s == ""){
            return -1;
        }

        int sum = 0;

        for (char c: s.toCharArray()){
            if (Character.isDigit(c)){
                sum += c;
            }
        }
        return sum;
    }
}
