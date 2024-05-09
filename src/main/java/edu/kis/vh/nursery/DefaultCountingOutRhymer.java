package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int FALSE = -1;
    public static final int TABLE_SIZE = 12;
    private int[] numbers = new int[TABLE_SIZE];

    public int total = FALSE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == FALSE;
    }

    public boolean isFull() {
        return total == TABLE_SIZE-1;
    }

    protected int peekaBoo() {
        if (callCheck())
            return FALSE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return FALSE;
        return numbers[total--];
    }

}
