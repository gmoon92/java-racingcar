package racing.validation;

import racing.domain.RacingCar;

public final class DomainValidation {

  private DomainValidation() {
  }

  public static void checkExceedStringLength(String str, int limitLength) {
    checkExceedStringLength(str, limitLength, "Column length limit exceeded.");
  }

  public static void checkExceedStringLength(String str, int limitLength, String message) {
    checkExceedStringLength(str.length(), limitLength, message);
  }

  public static void checkExceedStringLength(int length, int limitLength, String message) {
    if (length > limitLength) {
      throw new IllegalArgumentException(message);
    }
  }

  public static final class RacingCarValid {
    public final static int RACING_CAR_NAME_LENGTH = 5;

    private RacingCarValid() {
    }

    public static void check(RacingCar racingCar) {
      String message = "Car name length is exceed";
      int nameLength = racingCar.name().length();
      checkExceedStringLength(nameLength, RACING_CAR_NAME_LENGTH, message);
    }
  }
}
