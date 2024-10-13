package Task3;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;

public class BigNumberCalculator {
    public String addBigNumbers(char[] number1, char[] number2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = number1.length - 1; i >= 0; i--) {
            if ((int) number1[i] + (int) number2[i] < 10 && carry == 0) {
                result.append((char) ((int) number1[i] + (int) number2[i]));
            } else if (carry == 0) {
                result.append((char) (((int) number1[i] + (int) number2[i]) % 10));
                carry = 1;
            }
            else {
                result.append((char) (((int) number1[i] + (int) number2[i] + carry) % 10));
            }
            if (carry != 0)
                result.append((char) carry);
        }
        return result.reverse().toString();
    }

}


