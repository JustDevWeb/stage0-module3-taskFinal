package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int number1 = number % 10;
        int number2 = (number / 10) % 10;
        int number3 = number / 100;

        int reversedNumber = number1 * 100 + number2 * 10 + number3;

        System.out.println(reversedNumber);
    }
}
