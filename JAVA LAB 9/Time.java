class HrsException extends Exception {
    public HrsException(String message) {
      super(message);
    }
  }
  
  class MinException extends Exception {
    public MinException(String message) {
      super(message);
    }
  }
  
  class SecException extends Exception {
    public SecException(String message) {
      super(message);
    }
  }
  
  class Time {
    private int hours;
    private int minutes;
    private int seconds;
  
    public Time(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
      if (hours > 24 || hours < 0) {
        throw new HrsException("Invalid hours value");
      } else {
        this.hours = hours;
      }
  
      if (minutes > 60 || minutes < 0) {
        throw new MinException("Invalid minutes value");
      } else {
        this.minutes = minutes;
      }
  
      if (seconds > 60 || seconds < 0) {
        throw new SecException("Invalid seconds value");
      } else {
        this.seconds = seconds;
      }
    }
  
    public int getHours() {
      return hours;
    }
  
    public int getMinutes() {
      return minutes;
    }
  
    public int getSeconds() {
      return seconds;
    }
  
    public static void main(String[] args) {
      try {
        Time time = new Time(25, 30, 45);
      } catch (HrsException e) {
        System.out.println("Caught an HrsException: " + e.getMessage());
      } catch (MinException e) {
        System.out.println("Caught a MinException: " + e.getMessage());
      } catch (SecException e) {
        System.out.println("Caught a SecException: " + e.getMessage());
      }
    }
  }
  