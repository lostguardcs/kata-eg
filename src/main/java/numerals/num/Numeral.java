package numerals.num;

public class Numeral {

	String convert(int givenNum){
        int remaining = givenNum;
        String result = "";

        while (remaining != 0){
        if (remaining >= 1000) {
            result += "M";
            remaining = remaining - 1000;
        } else if (givenNum >= 500){
            result += "D";
            remaining = remaining - 500;
        } else if (givenNum >= 100){
            result += "C";
            remaining = remaining - 100;
        } else if (givenNum >= 50) {
            result += "L";
            remaining = remaining - 50;
        } else if (givenNum >= 10) {
            result += "X";
            remaining = remaining - 10;
        }  else if (givenNum >= 5){
            result += "V";
            remaining = remaining - 5;
        } else if (givenNum > 0) {
            result += "I";
            remaining = remaining - 1;
        } 
        }
        return result;
    }

}