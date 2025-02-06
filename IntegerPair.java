public class IntegerPair {
    private int first;
    private int second;
    public IntegerPair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    public int getFirst() {
        return first;
    }
    public int getSecond() {
        return second;
    }
    public void swap() {
        int temp = second;
        second = first;
        first = temp;
    }
    public String toString() {
        return String.format("(%d,%d)", first, second);
    }
}