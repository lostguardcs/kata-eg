package numerals.num;

public class Numeral {

	String convert(int givenNum){
        if (givenNum == 1000) {
            return "M";
        } else if (givenNum == 500){
            return "D";
        } else if (givenNum == 100){
            return "C";
        } else if (givenNum == 50) {
            return "L";
        } else if (givenNum == 10) {
            return "X";
        }  else if (givenNum == 5){
            return "V";
        } else {
            return "I";
        }
    }

}