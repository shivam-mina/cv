
class ArmstrongNumbers {

    boolean isArmstrongNumber(int input) {
        int x = input;
    int digits = String.valueOf(input).length();
    int sum = 0;

    while (x > 0) {
        int digit = x % 10;
        sum += (int) Math.pow(digit, digits);
        x /= 10;
    }

    return sum == input;

    }

}
