package co.com.yourlogo.webproject.test.util;

public enum TImeOut {

    TIME_OUT_RESOURCE(10),
    TIME_SLEEP_RESOURCE(2000);


    private final int value;

    TImeOut(Integer value) {

        this.value = value;
    }

    public int getValue() {

        return value;
    }


}
