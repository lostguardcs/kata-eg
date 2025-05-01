package numerals.num;

public class Numeral {
        
	String convert(int givenNum){
        int remaining = givenNum;
        String result = "";

        while (remaining >= 0){
        if (remaining >= 1000) {
            result += "M";
            remaining = remaining - 1000;
        } else if (remaining >= 500){
            result += "D";
            remaining = remaining - 500;
        } else if (remaining >= 100){
            result += "C";
            remaining = remaining - 100;
        } else if (remaining >= 50) {
            result += "L";
            remaining = remaining - 50;
        } else if (remaining >= 10) {
            result += "X";
            remaining = remaining - 10;
        }  else if (remaining >= 5){
            result += "V";
            remaining = remaining - 5;
        } else if (remaining > 0) {
            result += "I";
            remaining = remaining - 1;
        } else if (remaining == 0){
            break;
        }
        }
         return result;
    }
    
}