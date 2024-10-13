package Task3;

public class BigNumberCalculator {
    public String addBigNumbers(char[] number1, char[] number2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = number1.length - 1; i >= 0; i--) {
            int digit1 = number1[i] - '0';
            int digit2 = number2[i] - '0';
            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum / 10;

        }
        if (carry > 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }

    public String subtractBigNumbers(char[] number1, char[] number2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = number1.length - 1; i >= 0; i--) {
            int digit1 = number1[i] - '0' - carry;
            int digit2 = number2[i] - '0';
            if (digit1 >= digit2) {
                result.append(digit1 - digit2);
            } else if (i != 0) {
                carry = 1;
                digit1 += 10;
                result.append(digit1 - digit2);
            } else {
                result.append(digit2 - digit1);
                return "-" + result.reverse();
            }
        }
        if (result.charAt(result.length() - 1) == '0')
            return "0";
        else
            return result.reverse().toString();
    }

    public String multiplyBigNumbers(char[] number1, int multiplier) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        boolean minus = false;
        if (multiplier == 0) return "0";
        if (multiplier < 0){
            multiplier = -multiplier;
            minus = true;
        }
        for (int i = number1.length - 1; i >= 0; i--) {
            int digit1 = number1[i] - '0';
            int digit2 = (multiplier * digit1) % 10 + carry;
            if (digit1 * multiplier >= 10) {
                carry = 1;
            }
            else carry = 0;
            result.append(digit2);
        }
        if (carry > 0) {
            result.append(carry);
        }
        if (minus)
            result.append("-");
        return result.reverse().toString();
    }



}


