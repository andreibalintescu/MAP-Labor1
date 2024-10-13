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
            } else if(i != 0){
                carry = 1;
                digit1 += 10;
                result.append(digit1 - digit2);
            }
            else{
                result.append( digit2 - digit1);
                return "-" + result.reverse();
            }
        }
        if (result.charAt(result.length() - 1) == '0')
            return "0";
        else
            return result.reverse().toString();
    }

}


