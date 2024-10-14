package Task3;

public class BigNumberCalculator {
    public String addBigNumbers(char[] number1, char[] number2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = number1.length - 1; i >= 0; i--) {
            int digit1 = number1[i] - '0';
            int digit2 = number2[i] - '0';
            // Add the digits with the carry, for each iteration
            int sum = digit1 + digit2 + carry;
            // Append least significant digit
            result.append(sum % 10);
            // Determine carry for next iteration
            carry = sum / 10;

        }
        // Leftover carry, added to the front
        if (carry > 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }

    public String subtractBigNumbers(char[] number1, char[] number2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        boolean minus = false;
        if (isSmaller(number1, number2)) {
            char[] temp = number1;
            number1 = number2;
            number2 = temp;
            minus = true;
        }
        for (int i = number1.length - 1; i >= 0; i--) {
            int digit1 = number1[i] - '0' - carry;
            int digit2 = number2[i] - '0';
            if (digit1 >= digit2) {
                result.append(digit1 - digit2);
                carry = 0;
            } else if (i != 0) {
                carry = 1;
                digit1 += 10;
                result.append(digit1 - digit2);
            }
        }
        // Eliminate leading zeros
        while (result.length() > 1 && result.charAt(result.length() - 1) == '0') {
            result.deleteCharAt(result.length() - 1);
        }
        if (minus)
            return "-" + result.reverse();
        else
            return result.reverse().toString();
    }


    public String multiplyBigNumbers(char[] number1, int multiplier) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        boolean minus = false;
        if (multiplier == 0) return "0";
        if (multiplier < 0) {
            multiplier = -multiplier;
            minus = true;
        }
        for (int i = number1.length - 1; i >= 0; i--) {
            int digit1 = number1[i] - '0';
            int multiplication = (multiplier * digit1) % 10 + carry;
            // Change carry value
            if (digit1 * multiplier >= 10) {
                carry = digit1 * multiplier / 10;
            } else carry = 0;
            result.append(multiplication);
        }
        if (carry > 0) {
            result.append(carry);
        }
        if (minus)
            result.append("-");
        return result.reverse().toString();
    }

    public String divideBigNumbers(char[] number1, int divisor) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        boolean minus = false;
        if (divisor == 0) return "Ungültiges Teiler";
        if (divisor < 0) {
            divisor = -divisor;
            minus = true;
        }
        for (int i = 0; i < number1.length; i++) {
            int digit1 = number1[i] - '0';
            if (i == 0 && digit1 % divisor != 0)
                carry = digit1;
            else if (digit1 % divisor != 0) {
                result.append((carry * 10 + digit1) / divisor);
                carry = (carry * 10 + digit1) % divisor;
            } else if (digit1 % divisor == 0 && carry == 0) {
                result.append(digit1 / divisor);

            } else if (digit1 % divisor == 0){
                result.append((carry * 10 + digit1) / divisor);
                carry = 0;
            }
        }
        if (minus) {
            StringBuilder reversed = result.reverse();
            reversed.append("-");
            return reversed.reverse().toString();
        }

        return result.toString();
    }

    // Helper function for subtraction
    private boolean isSmaller(char[] number1, char[] number2) {

        for (int i = 0; i < number1.length; i++) {
            if (number1[i] < number2[i]) {
                return true;
            } else if (number1[i] > number2[i]) {
                return false;
            }
        }

        return false;
    }


}




