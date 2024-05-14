package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int START_VALUE = -1;
    public static final int TABLE_SIZE = 12;
    public static final int LAST_INDEX = TABLE_SIZE - 1;
    public static final int IF_EMPTY =-1;
    private final int[] numbers = new int[TABLE_SIZE];
    public int total = START_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == IF_EMPTY;
    }

    public boolean isFull() {
        return total == LAST_INDEX;
    }

    protected int peekaBoo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total--];
    }

}
