class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
      super(message);
    }
  }
  
  class InputProcessor {
    public void ProcessInput(int num) throws NegativeNumberException {
      if (num < 0) {
        throw new NegativeNumberException("The number entered is negative.");
      } else {
        double doubleValue = (double) num;
        System.out.println("The double value of the entered number is: " + doubleValue);
      }
    }
  
    public static void main(String[] args) {
      InputProcessor inputProcessor = new InputProcessor();
      int userInput = -10;
      try {
        inputProcessor.ProcessInput(userInput);
      } catch (NegativeNumberException e) {
        System.out.println("Caught an NegativeNumberException: " + e.getMessage());
      }
    }
  }
  