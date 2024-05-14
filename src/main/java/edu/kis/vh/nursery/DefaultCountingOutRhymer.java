package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int START_VALUE = -1;
    private static final int TABLE_SIZE = 12;
    private static final int LAST_INDEX = TABLE_SIZE - 1;
    private static final int IF_EMPTY =-1;
    private final int[] numbers = new int[TABLE_SIZE];
    private int total = START_VALUE;

    public int getTotal() {
		return total;
	}

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

	public void setTotal(int total) {
		this.total = total;
	}

	public static int getStartValue() {
		return START_VALUE;
	}

	public static int getTableSize() {
		return TABLE_SIZE;
	}

	public static int getLastIndex() {
		return LAST_INDEX;
	}

	public static int getIfEmpty() {
		return IF_EMPTY;
	}

}
