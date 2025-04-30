package numerals.num;

public class Numeral {

	String convert(int givenNum){
        if (givenNum == 10) {
            return "X";
        }  else if (givenNum == 5){
            return "V";
        } else {
            return "I";
        }
    }

}