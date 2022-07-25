// I was completely skunked on this one, so I found this code in the discussion forum from Eddie!
// I was using getters but it turns out that you don't need to use them since everything is internal to
// the class.


public class SimpleCalculator {

    private double firstNumber = 0;
    private double secondNumber = 0;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber=firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber=secondNumber;
    }


    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult () {

        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult () {

        return firstNumber * secondNumber;
    }

    public double getDivisionResult () {

        return (secondNumber==0) ? 0 : firstNumber/secondNumber; //This hasn't been taught yet, but it's a ternary operator!
    }

}
